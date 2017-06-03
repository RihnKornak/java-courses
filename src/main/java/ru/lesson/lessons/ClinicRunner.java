package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ClinicRunner {
    private BufferedReader reader;
    private Admin admin;
    private User user;


    public ClinicRunner(Admin admin, User user){
        this.admin = admin;
        this.user = user;
    }

    private void listClients(){
        System.out.println("Список клиентов клиники :");
        for (Client client : this.admin.list()){
            System.out.println(client.toString());
        }
    }

    private void listPets(Client client){
        System.out.println("Список питомцев клиента " + client.getName());
        for (Pet pet : client.getPets()){
            System.out.println(pet.toString());
        }
    }



    private void openConsole(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    private void closeConsole() throws IOException {
        this.reader.close();
    }

    private void removeClient() throws IOException{
        System.out.println("Введите имя удаляемого клиента :");
        String clientName = this.reader.readLine();
        if (this.admin.search(this.admin.searchClient(clientName))) {
            this.admin.delete(this.admin.searchClient(clientName));
            System.out.println("Клиент " + clientName + " успешно удален.");
        } else {
            System.out.println("Введено неправильное имя или такого клиента нет в клинике.");
        }
    }

    private void removePet(Client client) throws IOException{
        String nameOfPet = null;
        if (client != null) {
            System.out.println("Введите кличку питомца, который не будет более обслуживаться в клинике :");
            nameOfPet = this.reader.readLine();
            Pet pet = this.admin.searchPet(client, nameOfPet);
            if (this.admin.search(pet)) {
                this.admin.delete(client, pet);
                System.out.println("Питомец по кличке " + nameOfPet +  " клиента " + client.getName() + " более не обслуживается в клинике");
            }else System.out.println("Питомец по кличке " + nameOfPet + " в базе не обнаружен!");
        }
    }





    private void editClientName(String oldName, String newName){
        if (user.search(user.searchClient(oldName))){
            admin.editClient(oldName, newName);
        }
    }

    private Pet addPet() throws IOException {
        System.out.println("Введите кличку животного :");
        String petName = this.reader.readLine();
        return new Pet(petName);

    }
    private void editPetName(String clientName) throws IOException{
        System.out.println("Введите кличку питомца, которую желаете изменить :");
        String name = this.reader.readLine();
        System.out.println("Введите новую кличку питомца, которую ему предстоит запомнить :");
        String newName = this.reader.readLine();
        Pet pet = new Pet(name);
        if (admin.search(pet)) {
            admin.editPet(admin.searchClient(clientName), pet, newName);
        }

    }

    private void listAllPets() throws IOException{
            System.out.println("Список всех содержащихся в базе питомцев :");
            for (Client client: this.user.list() ) {
                for (Pet pet : client.getPets()){
                    System.out.println(pet.toString());
            }
        }
    }

    private void listAllPets(String clientName){
            System.out.println("Список всех питомцев клиента" + clientName + " :");
            ArrayList<Pet> pets = this.user.listPets(this.user.searchClient(clientName));
            for (Pet pet : pets){
                System.out.println(pet.toString());
        }

    }

    private void searchClient()  throws IOException{
        String clientName = this.reader.readLine();
        if (clientName != null) {
            Client client = this.user.searchClient(clientName);
            if (this.user.search(client)) {
                System.out.println(client.toString());
            }System.out.println("Введено неправильное имя или такого клиента нет в клинике.");
        }
    }
    private void searchPet() throws IOException{
            String name = this.reader.readLine();
            if (name != null) {
                ArrayList<Pet> pets = this.user.searchPet(name);
                if (pets.size() != 0) {
                    System.out.println("Список питомцев клиники с кличкой " + name + " :");
                    for (Pet pet : pets) {
                        System.out.println(pet.toString());
                    }
                } else System.out.println("Питомец по кличке " + name + " в базе не обнаружен!");

            }
    }

    private void addClient() throws IOException {
        System.out.println("Введите имя клиента :");
        String clientName = this.reader.readLine();
        Client client = new NoClient();
        if (clientName != null) {
            client.setName(clientName);
            admin.add(client);
            System.out.println("Введите количество питомцев клиента, которые будут обслуживаться в клинике :");
            int count = Integer.parseInt(this.reader.readLine());
            client.setName(clientName);
            for (int i = 0; i < count; i++) {
                client.setPets(this.addPet());
            }
        }
        admin.add(client);
    }

    private void editClient(String clientName)  throws IOException{
        Menu menu = new Menu();
        int digit = 0;
        if ((clientName = this.reader.readLine()) != null){

            while (digit != 6) {
                menu.showClientEditMenu(clientName);
                digit = this.inputDigit();
                if (digit == 1) {
                    System.out.println("Введите новое имя для клиента " + clientName);
                    this.editClientName(clientName, this.reader.readLine());
                }

                if (digit == 2) {
                    this.editPetName(clientName);
                }

                if (digit == 3) {
                        admin.addPet(admin.searchClient(clientName), this.addPet());
                }

                if (digit == 4) {
                        this.removePet(admin.searchClient(clientName));
                }

                if (digit == 5) this.listAllPets(clientName);

                if (digit == 6) this.mainMenu(isAccess());

                if (digit < 1 || digit > 6) System.out.println("Повторите ввод");
            }
        }else System.out.println("Введено неправильное имя или такого клиента нет в клинике.");
    }

    private void mainMenuAdmin() throws IOException {
        int digit = 0;
        while (digit != 8) {
            new Menu().showAdminTopMenu();
            digit = this.inputDigit();

            if (digit == 1) this.addClient();

            if (digit == 2) this.inputClientName();

            if (digit == 3) this.removeClient();

            if (digit == 4) this.listClients();

            if (digit == 5) this.listAllPets();

            if (digit == 6) this.searchClient();

            if (digit == 7) this.searchPet();

            if (digit == 8) System.exit(0);

            if (digit < 1 || digit > 8) System.out.println("Повторите ввод");
        }
    }



    private void mainMenuUser() throws IOException {
        int digit = 0;
        while (digit != 5) {
            new Menu().showUserTopMenu();
            digit = this.inputDigit();

            if (digit == 1) this.listClients();

            if (digit == 2) this.listAllPets();

            if (digit == 3) this.searchClient();

            if (digit == 4) this.searchPet();

            if (digit < 1 || digit > 6) System.out.println("Повторите ввод");
        }
        if (digit == 5) System.exit(0);

    }

    private void mainMenu(boolean isAdmin) throws IOException {
        if (isAdmin) this.mainMenuAdmin();
        else this.mainMenuUser();
    }

    private int inputDigit() {
        boolean isValid = false;
        int digit = 0;

        circle:
        while (!isValid) {
            try {
                digit = Integer.parseInt(this.reader.readLine());
                isValid = true;
            } catch (IOException e) {
                System.out.println("Что-то пошло не так. Повторите ввод :");
                continue circle;
            }
        }
        return digit;
    }


    private void inputClientName() throws IOException {
        System.out.println("Введите имя клиента, с которым желаете работать :");
        String clientName;
        while ((clientName = this.reader.readLine()) == null){
            System.out.println("Вы ничего не ввели. Повторите ввод.");
            System.out.println("Пустое поле.Введите имя клиента, с которым желаете работать :");
        }
        this.editClient(clientName);

    }

    /**
     * Check is the user of program admin
     * @return true if user is Admin & false if user is User
     */
    private boolean isAccess() throws IOException {
    boolean isAdmin = false;
    new Menu().showStatusConsole();
        String status = this.reader.readLine();
        if (status.equalsIgnoreCase("yes")) {
            System.out.println("Для подтверждения вашего статуса администратора введите пароль ниже :");
            if (this.reader.readLine().equals(admin.getPassword())){
            isAdmin = true;
            }else System.out.println("\nНеправильный пароль. Вы продолжите работу как пользователь! \n*****\n");
        }
        return isAdmin;
    }

    public static void main(String[] args)  throws IOException{
        Clinic clinic = new Clinic();
        Admin admin = new Admin(clinic);
        User user = new User(clinic);
        ClinicRunner runner = new ClinicRunner(admin, user);
        runner.openConsole();
        boolean isAdmin = false;
            if (runner.isAccess()) isAdmin = true;
                runner.mainMenu(isAdmin);
                runner.closeConsole();





    }
}



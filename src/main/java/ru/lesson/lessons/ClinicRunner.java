package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClinicRunner {
    private final Clinic clinic;
    private BufferedReader reader;

    public ClinicRunner(Clinic clinic){
        this.clinic = clinic;
    }
    public void topMenu(){
        System.out.println("Добро пожаловать в СУБД клиники для животных.");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Пользуясь меню ниже, вы можете оперировать данными: ");
        System.out.println("1. Добавить нового клиента");
        System.out.println("2. Редактировать записи имеющегося в базе клиента");
        System.out.println("3. Удалить из базы данных клиники записи клиента");
        System.out.println("4. Показать всех имеющихся клиентов");
        System.out.println("5. Показать всех имеющихся в базе питомцев");
        System.out.println("6. Выйти из программы");
        System.out.println("Выберите необходимое действие вводом цифры меню:");
    }

    public void clientEditMenu(){
        System.out.println("Вы находитесь в меню редактирования записей клиента.");
        System.out.println("_____________________________________________");
        System.out.println("Выберите необходимое действие из меню ниже :");
        System.out.println("1. Изменить имя клиента");
        System.out.println("2. Изменить имя питомца");
        System.out.println("3. Добавить питомца");
        System.out.println("4. Удалить питомца");
        System.out.println("5. Показать всех питомцев клиента");
        System.out.println("6. Выйти из этого меню");
        System.out.println("Сделайте выбор, несмелый вы наш");

    }
    public boolean isAccess(){
return true;
    }

    public void list(){
        System.out.println("Список клиентов клиники :");
        for (Client client : this.clinic.getClients()){
            System.out.println(client.toString());
        }
    }

    public void listPets(Client client){
        System.out.println("Список питомцев клиента " + client.getName());
        for (Pet pet : client.getPets()){
            System.out.println(pet.toString());
        }
    }

    public void listAllPets(){
        System.out.println("Список всех содержащихся в базе питомцев :");
        for (Client client : this.clinic.getClients()){
            for (Pet pet : client.getPets()){
                System.out.println(pet.toString());
            }
        }
    }

    public void returnToTopMenu(){
        try {
            Runtime.getRuntime().exec("cls");
        } catch (IOException e) {
            this.topMenu();
        }
        this.topMenu();
    }

    public void openConsole(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void closeConsole() throws IOException {
        this.reader.close();
    }

    public Pet addPet() throws IOException {
        System.out.println("Введите кличку животного :");
        String petName = this.reader.readLine();
        return new Pet(petName);

    }
    private void removePet(Client client, String name){
        boolean isInBase = false;
        System.out.println("Введите кличку питомца, который не будет более обслуживаться в клинике :");
        String nameOfPet = name;
        for (Pet pet : client.getPets()){
            if (pet.getName().equals(name)) isInBase = true;
        }
        if (isInBase) {
            client.removePet(name);
            System.out.println("Питомец по кличке " + name +  " клиента " + client.getName() + " более не обслуживается в клинике");
        } else System.out.println("Питомец по кличке " + name + " в базе не обнаружен!");

    }



    public void editClient(Client client) throws IOException {
        boolean isInBase = false;
        for (Client client1 : this.clinic.getClients()) {
            if (client1.getName().equals(client.getName())) isInBase = true;
        }
        if (isInBase){
            this.clientEditMenu();
        int digit = Integer.parseInt(this.reader.readLine());
        if (digit == 1) {
            System.out.println("Введите новое имя клиента");
            client.setName(this.reader.readLine());
        }
        if (digit == 2) {
            System.out.println("Введите кличку питомца, которую желаете изменить :");
            String name = this.reader.readLine();
            System.out.println("Введите новую кличку питомца, которую ему предстоит запомнить :");
            client.renamePet(name, this.reader.readLine());
        }
        if (digit == 3) {
            System.out.println("Добавляем нового питомца.");
            Pet pet = this.addPet();
            client.addPets(pet);
            System.out.println("Новый питомец " + pet.getName() + " добавлен клиенту " + client.getName());
        }
        if (digit == 4) {
            this.removePet(client, this.reader.readLine());
        }
        if (digit == 5) this.listPets(client);
        if (digit == 6) {
            this.returnToTopMenu();
        }
        if (digit < 1 || digit > 6) System.out.println("Где-то ошибка, повторите ввод");
        if (digit != 6) this.editClient(client);
    }else {
            System.out.println("Клиент с таким именем в базе не обнаружен! Повторите выбор.");
            System.out.println();
            this.topMenu();
        }
    }

    public void addClient() throws IOException{
        System.out.println("Введите имя клиента :");
        String clientsName = this.reader.readLine();
        System.out.println("Введите количество питомцев клиента, которые будут обслуживаться в клинике :");
        int count = Integer.parseInt(this.reader.readLine());
        Client client = new Client();
        client.setName(clientsName);
        for (int i = 0; i < count; i++){
            client.addPets(this.addPet());
        }
      this.clinic.setClients(client);
    }
    public static void main(String[] args)  throws IOException{
        Clinic clinic = new Clinic();
        ClinicRunner runner = new ClinicRunner(clinic);
        runner.openConsole();
        int digit = 0;
        reload: while (digit != 6) {
            runner.topMenu();
            try {
                digit = Integer.parseInt(runner.reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Что-то пошло не так. Повторите ввод :");
                continue reload;
            } catch (IOException e) {
                System.out.println("Что-то пошло не так. Повторите ввод :");
                continue reload;
            }
            if (digit == 1) runner.addClient();
            if (digit == 2) {
                System.out.println("Введите имя клиента, подлежащего редактированию :");
                runner.editClient(clinic.searchByClient(new Client(runner.reader.readLine())));
            }
            if (digit == 3) {
                System.out.println("Введите имя удаляемого клиента :");
                Client removingClient = new Client();
                removingClient.setName(runner.reader.readLine());
                clinic.remove(clinic.searchByClient(removingClient));
            }
            if (digit == 4) runner.list();
            if (digit == 5) runner.listAllPets();
        }
        runner.closeConsole();
        if (digit == 6) System.exit(0);
    }

}

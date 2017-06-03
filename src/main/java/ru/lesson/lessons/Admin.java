package ru.lesson.lessons;


import java.util.ArrayList;

/**
 * This class implements the User of Clinic with extended rights.
 * Only objects of this class can change state of the client's base: add, modify or remove clients and their pets.
 */

public class Admin extends User implements CrUD, Look{

    private final Clinic clinic;
    private String password = "111";

    /**
     * Creating the new Admin Object with compete base of clients
     * @param clinic - Clinic object with a base of clients
     */
    public Admin(Clinic clinic){
        super(clinic);
        this.clinic = clinic;
    }

     String getPassword() {
        return password;
    }

    /**
     * This method adds a new Client
     * @param client is a new Client
     */
    public void add(Client client) {
        this.clinic.getClients().add(client);
    }

    /**
     * This method adds the new Pet to the client
     * @param client is the client in base
     * @param pet is add to client
     */
    public void addPet(Client client, Pet pet) {
        if (client != null) {
            if (pet != null){
                for (Client clientInBase : this.clinic.getClients()) {
                    if (clientInBase.equals(client)) {
                        clientInBase.setPets(pet);

                    }
                }
            }
        }
    }

    /**
     * By this method you can edit your clients in base
     * @param client is a client, who will be edit
     * @param newName is a new name for the editing client
     */
    public void editClient(Client client, String newName) {
        if (client != null){
            for (Client clientInBase : this.clinic.getClients()) {
                if (clientInBase.getName().equals(client.getName())) {
                    clientInBase.setName(newName);
                }
            }
        }
    }

    /**
     * Here you change name for a client in base
     * @param oldName is a name to identificate a client you need
     * @param newName is a new name for that client
     */
    public void editClient(String oldName, String newName) {
        if (newName != null){
            for (Client clientInBase : this.clinic.getClients()) {
                if (clientInBase.getName().equals(oldName)) {
                    clientInBase.setName(newName);
                }
            }
        }
    }



    /**
     * This method is edit record about client's Pet- it changes pet's name
     * @param client is a client, which pet will be renamed
     * @param pet is a pet, which will be renamed
     * @param newName is a new name for selected pet
     */
    public void editPet(Client client, Pet pet, String newName) {
        if (client != null) {
            if (pet != null) {
                for (Client clientInBase : this.clinic.getClients()) {
                    if (clientInBase.equals(client)){
                        for (Pet petOfClient : clientInBase.getPets()){
                            if (petOfClient.equals(pet)) petOfClient.setName(newName);
                        }
                    }

                }
            }
        }
    }

    /**
     *
     *  This method delete client from base
     * @param client is the removing client
     */
    public void delete(Client client) {
        ArrayList<Client> clients =  this.clinic.getClients();
        for (int i = 0; i <clients.size(); i++){
            if (clients.get(i).equals(client)) clients.remove(i);
        }

    }

    /**
     * This method deletes a pet, which belongs to client
     * @param client is a client, which pet will be deleted
     * @param pet is a aim of deleting
     */
    public void delete(Client client, Pet pet) {
        if (client != null && pet != null) {
            ArrayList<Client> clients = this.clinic.getClients();
            for (Client clientInBase : this.clinic.getClients()) {
                if (clientInBase.equals(client)) {
                    for (int j = 0; j < clientInBase.getPets().size(); j++) {
                        if (clientInBase.getPets().get(j).equals(pet)) clientInBase.getPets().remove(j);
                    }
                }
            }
        }
    }


}

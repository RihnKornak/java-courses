package ru.lesson.lessons;

import java.util.ArrayList;

/**
 * Objects of this class used to observe clinic and look for the specific client or pet.
 */
public class User implements Look {
    private Clinic clinic;

    public User(Clinic clinic){
        this.clinic = clinic;
    }

    /**
     * This method need to observe base of clients in clinic
     * @return arraylist, which contains all clients of clinic
     */
    public ArrayList<Client> list() {
        return this.clinic.getClients();
    }

    /**
     * This method show all pets of specific client
     * @param client - whoes pets will be return
     * @return arraylist of all pets of client
     */
    public ArrayList<Pet> listPets(final Client client) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        if (client != null){
            for (Client clientInBase : this.clinic.getClients()){
                if (clientInBase.equals(client)){
                    pets.addAll(clientInBase.getPets());
                }
            }
        }
    return pets;
    }

    /**

     * Search a specific client in base of clinic
     * @param client is aim client
     * @return true if there is such client in base
     */
    public boolean search(final Client client) {
        boolean result = false;
        if (client != null){
            for (Client clientInBase : this.clinic.getClients()){
                if (clientInBase.equals(client)) result = true;
            }
        }
    return result;
    }

    /**
     * Search one specific pet of client. Method returns true or false
     * @param pet is aim pet
     * @return  true if there is such pet in base
     */
    public boolean search(final Pet pet) {
        boolean result = false;
        if (pet != null){
            for (Client clientInBase : this.clinic.getClients()){
                for (Pet petInBase : clientInBase.getPets()){
                    if (petInBase.equals(pet)) result = true;
                }
            }
        }
    return result;
    }

    /**
     * Searches a client in base by his name
     * @param name is a name of client
     * @return client with such name
     */
    public Client searchClient(final String name) {
        Client client = new NoClient();
        if (name != null){
            for (Client clientInBase : this.clinic.getClients()){
                if (clientInBase.getName().equals(name)) client = clientInBase;
            }
        }
    return client;
    }

    /**
     * Searches a list of pets in base, named as arg
     * @param name is name of needed pet
     * @return list of pets
     */
    public ArrayList<Pet> searchPet(final String name) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        if (name != null){
            for (Client clientInBase : this.clinic.getClients()){
                for (Pet petInBase : clientInBase.getPets()){
                    if (petInBase.getName().equals(name)) pets.add(petInBase);
                }
            }
        }
    return pets;
    }

    public Pet searchPet(Client client, String name) {
        Pet pet = new NoPet();
        for (Client clientInBase : this.clinic.getClients()){
            if (clientInBase.equals(client)){
                for (Pet petInBase : clientInBase.getPets()){
                    if (petInBase.getName().equals(name)) pet = petInBase;
                }
            }
        }
        return pet;
    }
}

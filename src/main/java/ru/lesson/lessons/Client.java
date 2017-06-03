package ru.lesson.lessons;

import java.util.ArrayList;

/**
 * Created by Maxxx on 25.05.2017.
 */
public class Client {
    private String name = "";
    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public Client(){}

    public Client(String name, Pet ... pets){
        this.name = name;
        if (pets != null){
        for (Pet newPet : pets) {
            this.pets.add(newPet);
        }
        }
        //else this.pets.add(new NoPet());
    }
    public Client(String name){
        this.name = name;
    }

    public ArrayList<Pet> getPets(){
        return this.pets;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets.addAll(pets);
    }

    public void setPets(Pet pet) {
        this.pets.add(pet);
    }

    public void removePet(String nameOfPet){
        for (int i = 0; i < this.pets.size(); i++){
            if (this.pets.get(i).getName().equals(nameOfPet)) this.pets.remove(i);
        }
    }

    public void renamePet(String oldName, String newName){
        boolean isInBase = true;
        for (Pet pet : this.pets){
            if (pet.getName().equals(oldName)){
                pet.setName(newName);
                isInBase = false;
                break;
            }
        }
        if (!isInBase) System.out.println("Питомец по кличке " + oldName + " в базе не обнаружен!");
    }

    @Override
    public String toString() {

        String allPets = "";
        for (Pet pet : this.pets){
            allPets += pet.toString() + " ";
        }
        allPets.trim();
        String result = "Имя клиента : " + this.name + "\n У клиента " + this.pets.size() + " питомцев : " + allPets;
        return result;
    }
}

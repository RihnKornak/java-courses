package com.javarush.task.task20.task2028;

import java.util.ArrayList;

/**
 * Created by Maxxx on 25.05.2017.
 */
public class Client {
    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();

    public Client(){}

    public Client(String name, Pet ... pets){
        this.name = name;
        for (Pet newPet : pets){
            this.pets.add(newPet);
        }
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
        this.pets = pets;
    }
}

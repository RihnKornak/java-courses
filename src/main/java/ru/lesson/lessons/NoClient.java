package ru.lesson.lessons;

import java.util.ArrayList;

/**
 * Created by Maxxx on 25.05.2017.
 */
public class NoClient extends Client {
    private String name = "";
    private ArrayList<Pet> pets = null;
    public NoClient() {}

    @Override
    public ArrayList<Pet> getPets() {
        return pets;
    }

    @Override
    public String getName() {
        return name;
    }
}

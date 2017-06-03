package ru.lesson.lessons;

/**
 * Created by Maxxx on 25.05.2017.
 */
public class NoPet extends Pet {
    private final String name = "";
    public NoPet(){}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    }
}

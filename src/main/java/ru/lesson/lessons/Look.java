package ru.lesson.lessons;

import java.util.ArrayList;

public interface Look {
    ArrayList<Client>  list();

   ArrayList<Pet> listPets(Client client);

    boolean search(Client client);

    boolean search(Pet pet);

    Client searchClient(String name);

    ArrayList<Pet> searchPet( String name);

    Pet searchPet(Client client, String name);
}

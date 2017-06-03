package ru.lesson.lessons;


public interface CrUD {
    void add(Client client);

    void editClient(Client client, String newName);

    void editClient(String oldName, String newName);

    void addPet(Client client, Pet pet);

    void editPet(Client client, Pet pet, String newName);

    void delete(Client client);

    void delete(Client client, Pet pet);
}

package com.javarush.task.task20.task2028;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maxxx on 25.05.2017.
 */
public class Clinic {
    ArrayList<Client> clients = new ArrayList<Client>();

    public static void main(String[] args) {
        Client vasa = new Client("Vasa", new Pet("Cat"), new Pet("Dog. Hot Dog"));
        Client kola = new Client("Kola", new Pet("Cat"));
        Clinic clinic = new Clinic(vasa, kola);
        for (Client client : clinic.clients) {
            System.out.println("Клиент " + client.getName() + ", имеет в наличии животных:");
            for (Pet pet : client.getPets()) {
                System.out.println("Pet is " + pet.getName());
            }
        }

        clinic.clients.remove(kola);
        System.out.println("ОСТАЛОСЬ КЛИЕНТОВ - ");
        for (Client client : clinic.clients) {
            System.out.println("Клиент " + client.getName() + ", имеет в наличии животных:");
            for (Pet pet : client.getPets()) {
                System.out.println("Pet is " + pet.getName());
            }
        }
    }

    public Clinic(){

    }

    public Clinic(Client ... clients){
        for (Client client : clients) {
            this.clients.add(client);
        }
    }

    public Client searchByClient(List<Client> clients, Client client){
        Client result = new NoClient();
        for (Client clientInBase : clients){
               if (clientInBase.getName().equals(client)) result = clientInBase;
        }
        return result;
    }

    public Client searchByPet(Client client, Pet pet){
        Client result = new NoClient();
        for (Pet petOfClient : client.getPets()){
                if (petOfClient.getName().equals(pet.getName())) result = client;
        }
        return result;
    }

    public void editClient(Client client, String newName){
        client.setName(newName);
    }
    public void editClient(Client client, Pet ... pets){
        for (Pet pet : pets){
            client.getPets().add(pet);
        }

    }
    public void editClient(Client client, String newName, Pet ... pets){
        for (Pet pet : pets){
            client.getPets().add(pet);
        }
        client.setName(newName);
    }

    public void remove(Client client){
        for (int i = 0; i < this.clients.size(); i++){
            if (this.clients.get(i).equals(client)) {
                this.clients.remove(i);
            }
        }
    }


}

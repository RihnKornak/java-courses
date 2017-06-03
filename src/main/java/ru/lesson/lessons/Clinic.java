package ru.lesson.lessons;

import java.util.ArrayList;

/**
 * Created by Maxxx on 25.05.2017.
 */
public class Clinic {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public Clinic() {

    }

    public Clinic(Client... clients) {
        for (Client client : clients) {
            this.clients.add(client);
        }
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}

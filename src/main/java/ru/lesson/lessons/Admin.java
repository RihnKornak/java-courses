package ru.lesson.lessons;

import java.util.ArrayList;

public class Admin implements Runnable {
    private Clinic clinic;
    //private
    public void addClient(Client client){
        clinic.setClients(client);
    }
    public void addClient(Clinic clinic, ArrayList<Client> client){
        clinic.setClients(client);
    }

    public void removeClient(Clinic clinic, Client client){
        clinic.remove(client);
    }


    public void run(){

//    Admin admin = new Admin();
//
//        admin.addClient(new Client("Client#1" , new Pet("Piggy")));
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        admin.addClient();
    }


    }



package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void testGetName() throws Exception {
        Client client = new Client();
        assertEquals("", client.getName());
    }
    @Test
    public void testGetName1() throws Exception {
        Client client = new Client("Test", null);
        assertEquals("Test", client.getName());
    }

    @Test
    public void testSetName() throws Exception {
        Client client = new Client();
        client.setName("Test");
        assertEquals("Test", client.getName());

    }

    @Test
    public void testSetPets() throws Exception {
        Client client = new Client();
        ArrayList<Pet> list = new ArrayList<Pet>();
        list.add(new Pet("Cat"));
        client.addPets(list);
        assertEquals(list, client.getPets());
    }

    @Test
    public void testGetPets() throws Exception {
        Pet pet = new Pet("TestPet1");
        Client client = new Client("Test1", pet);
        ArrayList<Pet> list = new ArrayList<Pet>();
        list.add(pet);

        assertEquals(list, client.getPets());
    }

}
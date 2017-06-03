package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClinicTest {

    Client result = new Client("Vasa", new Pet("Cat"), new Pet("Dog. Hot Dog"));
    Client result2 = new Client("Testtt", new Pet("xxx"));
    Clinic clinic = new Clinic(result, result2);

    /**
     * Test checks how will work method, if searching for name people have different quantity of pets
     * @throws Exception
     */
//    @Test
//    public void testSearchByClientWith2Args() throws Exception {
//        Client test = new Client("Vasa", new NoPet());
//        assertEquals(result, clinic.searchByClient(test));
//    }

    /** Test checks how will work method, if the field of search will be empty
     * @throws Exception
     */
//    public void testSearchByClientWithNoName() throws Exception {
//
//        Client test = new Client(null, new NoPet());
//        assertEquals(new NoClient(), clinic.searchByClient(test));
//    }

    /**
     * This test checks how works method, which search Client by his pet
     * @throws Exception
     */
//    @Test
//    public void searchByPet() throws Exception {
//        Pet pet = new Pet("Dog. Hot Dog");
//
//        assertEquals(result, clinic.searchByPet(pet));
//    }

//    @Test
//    public void testRemove() throws Exception {
//        Client willBeRemoved = new Client("Test", new Pet("TestPet"));
//        Clinic clin = new Clinic(willBeRemoved);
//         clin.remove(willBeRemoved);
//         ArrayList<Client> res = clin.getClients();
//         ArrayList<Client> zero = new ArrayList<Client>();
//        assertEquals(zero, res);
//    }

}
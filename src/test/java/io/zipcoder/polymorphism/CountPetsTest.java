package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class CountPetsTest {

    @Test
    public void numberOfPetsTest() {
        CountPets newPet = new CountPets();
        newPet.setNumberOfPets(10);

        Integer expectedNumOfPets = 10;

        Assert.assertEquals(expectedNumOfPets, newPet.getNumberOfPets());
    }

    @Test
    public void addPetsTest(){
        CountPets newPet = new CountPets();
        newPet.addPets("dog", "Coco");
        newPet.addPets("cat", "Momo");
        newPet.addPets("bird", "Jojo");

        Assert.assertEquals(3, newPet.getListOfPets().size());
        Assert.assertEquals("cat : Momo", newPet.getListOfPets().get(1));
    }
}

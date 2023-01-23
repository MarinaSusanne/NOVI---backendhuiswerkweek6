package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    @Test
    public void getNameReturnsName() {
        Pet bello = new Pet("Bello", 20, "teckel");
        String actual = bello.getName();
        //assert
        assertEquals("Bello", actual);
    }


    @Test
    public void setNameOverridesName() {
        Pet pollo = new Pet("Pollo", 20, "teckel");
        pollo.setName("Pollo-awesome");
        assertEquals("Pollo-awesome", pollo.getName());
    }

    @Test
    public void getAgeReturnsAge() {
        Pet pollo = new Pet("Pollo", 20, "teckel");
        assertEquals(20, pollo.getAge());
    }

    @Test
    public void setAgeOverridesAge() {
        Pet pollo = new Pet("Pollo", 20, "teckel");
        pollo.setAge(23);
        assertEquals(23, pollo.getAge());
    }

    @Test
    public void setSpeciesOverriseSpecies() {
        Pet pollo = new Pet("Pollo", 20, "teckel");
        pollo.setSpecies("golden retriever");
        assertEquals("golden retriever", pollo.getSpecies());
    }

    //
    @Test
    public void getOwnerReturnsOwner(){
        Person owner = new Person ("Camilo", "Muijs", "male", 34);
        Pet abu = new Pet ("Abu", 3,"teckel");
        abu.setOwner(owner);
        Person testing = abu.getOwner();
        assertEquals(owner, abu.getOwner());
    }

    @Test
    public void setOwnerOverridesOwnerOrAddsOwner(){
        Person owner1 = new Person ("Camilo", "Muijs", "male", 34);
        Pet abu = new Pet ("Abu", 3,"teckel");
        Person owner2 = new Person ("Susanne", "Hagen", "female", 32);
        abu.setOwner(owner1);
        Person testing = abu.getOwner();
        abu.setOwner(owner2);
        assertEquals(owner2, abu.getOwner());
    }
}

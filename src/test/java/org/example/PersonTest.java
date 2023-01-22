package org.example;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getNameReturnsName() {
        //arrange
        Person person = new Person("Pietje", "Puk", "male", 45);
        //act
        String actual = person.getName();
        //assert
        assertEquals("Pietje", actual);
    }


    @Test
    public void addChildtoChildrensList() {
        //arrange
        Person person = new Person("Marie", "koekoek", "female", 32);
        Person child = new Person("Anne", "Koekoek", "female", 6);
        //act
        person.addChild(child);
        List<Person> expected = person.getChildren();
        //assert
        assertEquals(List.of(child), expected);
    }


    @Test
    public void setNameOverridesName() {
        Person anne = new Person("Anne", "van der heijden", "female", 33);
        anne.setLastName("Dormir");
        assertEquals("Dormir", anne.getLastName());
    }


    @Test
    public void getLastNameReturnsLastName() {
        Person irene = new Person("Irene", "Van Rijsewijk", "female", 31);
        assertEquals("Van Rijsewijk", irene.getLastName());
    }

    @Test
    public void setLastNameOverridesLastName() {
        Person patricia = new Person("patricia", "den ambtman", "female", 32);
        patricia.setLastName("Klaasen");
        assertEquals("Klaasen", patricia.getLastName());
    }

    @Test
    public void getFirstNameAndReturnsFirstName() {
        Person jan = new Person("Jan", "Muijs", "male", 68);
        assertEquals("Jan", jan.getName());
    }

    @Test
    public void setMiddleNameOverridesMiddleName() {
        Person helga = new Person("Helga", "geen", "Fidder", "female", 67);
        helga.setMiddleName("Muijs");
        assertEquals("Muijs", helga.getMiddleName());
    }

    @Test
    public void getAgeAndReturnsAge() {
        Person jordi = new Person("Jordi", "Muijs", "male", 36);
        assertEquals(36, jordi.getAge());
    }

    @Test
    public void setAgeOverridesAge() {
        Person jordi = new Person("Jordi", "Muijs", "male", 36);
        jordi.setAge(37);
        assertEquals(37, jordi.getAge());
    }

    @Test
    public void addMotherAndAddFatherToPerson() {
        //arrange
        Person susanne = new Person("Susanne", "Hagen", "female", 32);
        Person mom = new Person("Jeannette", "de Jong", "female", 67);
        Person dad = new Person("Kees", "Hagen", "male", 66);
        //act
        susanne.addParents(mom, dad);
        //assert (heel gek, ik  moet dad de dad meegegeven
        assertEquals(mom, susanne.getMother());
        assertEquals(dad, susanne.getFather(dad));
    }

    @Test
    public void addSiblingsToSiblingsList() {
        //arrange
        Person susanne = new Person("Susanne", "Hagen", "female", 32);
        Person mom = new Person("Jeannette", "de Jong", "female", 67);
        Person dad = new Person("Kees", "Hagen", "male", 66);
        Person sister = new Person("Marietje", "Hagen", "female", 38);
        Person brother = new Person("Hendri", "Hagen", "male", 34);
        Person smallBrother = new Person("Jelle", "Hagen", "male", 30);
        //act
        susanne.addSiblings(sister);
        susanne.addSiblings(brother);
        susanne.addSiblings(smallBrother);
        List<Person> testing = susanne.getSiblings();
        //assert
        assertEquals(List.of(sister, brother, smallBrother), testing);
    }

    @Test
    public void addChildToChildrenList (){
        Person susanne = new Person ("Susanne")
    }

}







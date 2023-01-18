package org.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getNameReturnsName() {
        //arrange
        Person person = new Person("Pietje", "Puk", "man", 45);
        //act
        String expected = person.getName();
        //assert
        assertEquals("Pietje", expected);
    }


    @Test
    public void addChildtoChildrensList(){
        //arrange
        Person person = new Person("Marie", "koekoek", "vrouw", 32);
        Person child = new Person ("Anne", "Koekoek", "vrouw", 6);
        //act
        person.addChild(child);
        List<Person> expected = person.getChildren();
        //assert
        assertEquals (List.of(child), expected);
    }
}

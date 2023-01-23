package org.example;

import org.junit.Test;

import java.util.*;

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
        Person anne = new Person("Anne", "van der Heijden", "female", 33);
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
    public void addParentsToPerson() {
        //arrange
        Person susanne = new Person("Susanne", "Hagen", "female", 32);
        Person mom = new Person("Jeannette", "de Jong", "female", 67);
        Person dad = new Person("Kees", "Hagen", "male", 66);
        //act
        susanne.addParents(mom, dad);
        //assert
        assertEquals(mom, susanne.getMother());
        assertEquals(dad, susanne.getFather());

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
//        List<Person> testing = susanne.getSiblings();
        //assert
        assertEquals(List.of(sister, brother, smallBrother), susanne.getSiblings());
    }

    @Test
    public void addChildToChildrenList() {
        //arrange
        Person susanne = new Person("Susanne", "Hagen", "female", 32);
        Person sister1 = new Person("Hanna", "Willeke", "Hagen", "female", 35);
        Person sister2 = new Person("Calara", "Hagen", "female", 21);
        Person brother1 = new Person("Hendrik", "Hagen", "male", 29);
        Person brother2 = new Person("Jan", "Hagen", "male", 40);
        //act
        susanne.addSiblings(sister1);
        susanne.addSiblings(sister2);
        susanne.addSiblings(brother1);
        susanne.addSiblings(brother2);
//      List <Person> testing = susanne.getSiblings();
        //arrange
//      assertEquals(List.of(sister1, sister2,brother1, brother2), testing);
        assertEquals(List.of(sister1, sister2, brother1, brother2), susanne.getSiblings());
    }

    @Test
    public void setSiblingsOverridesOtherSiblings() {
        Person susanne = new Person("Susanne", "Hagen", "female", 32);
        Person sister1 = new Person("Hanna", "Willeke", "Hagen", "female", 35);
        Person sister2 = new Person("Calara", "Hagen", "female", 21);
        Person brother1 = new Person("Hendrik", "Hagen", "male", 29);
        Person brother2 = new Person("Jan", "Hagen", "male", 40);
        //act - I first add two sisters, then I override them by two brothers instead
        susanne.addSiblings(sister1);
        susanne.addSiblings(sister2);

        List<Person> testing = new ArrayList<Person>();
        testing.add(0, brother1);
        testing.add(1, brother2);
        susanne.setSiblings(testing);
        //ik overschrijf de zussen naar broers
        assertEquals(List.of(brother1, brother2), susanne.getSiblings());
    }

    @Test
    public void addPetsToPetsList() {
        Person jettie = new Person("Jettie", "Jansen", "female", 35);
        Pet klaasje = new Pet("klaasje", 12, "vuilnisbak");
        Pet pietje = new Pet("pietje", 15, "vuilnisbak");
        jettie.addPet(klaasje);
        jettie.addPet(pietje);
        assertEquals(List.of(klaasje, pietje), jettie.getPets());
    }

    @Test
    public void getGrandchildrenReturnsGrandchildren() {
        Person susanne = new Person("Susanne", "Hagen", "female", 32);
        Person mom = new Person("Jeannette", "de Jong", "female", 67);
        Person ava = new Person("Ava", "Muijs", "female", 3);
        Person dirkje = new Person("Dirkje", "Muijs", "female", 4);
        mom.addChild(susanne);
        susanne.addChild(ava);
        susanne.addChild(dirkje);
        assertEquals(List.of(ava, dirkje), mom.getGrandChildren());
    }


    @Test
    public void getAllPetsOfTheGrandChildren() {
        Person dad = new Person("Henk", "Beer", "man", 80);
        Person child = new Person("Ruud", "Beer", "man", 60);
        Person grandchild = new Person("Daniele", "Beer", "vrouw", 30);
        Pet dog = new Pet("Piet", 5, "Border collie");
        Pet cat = new Pet("Eco", 8, "something");
        Pet puppy1 = new Pet("Float", 1, "Blue merle");
        Pet puppy2 = new Pet("cutie", 1, "Blue merle");

        dad.addChild(child);
        child.addChild(grandchild);
        grandchild.addPet(dog);
        grandchild.addPet(cat);
        grandchild.addPet(puppy1);
        grandchild.addPet(puppy2);

        assertEquals(4, grandchild.getPets().size());
    }


    @Test
    public void getNiecesFromUncleReturnsListOfNieces () {
        Person uncle = new Person("Peter", "Held", "male", 50);
        Person person = new Person ("Janneke", "Held", "female", 48);
        Person karlijn = new Person("Karlijn", "Held", "female", 4);
        Person anneloes = new Person("Anneloes", "Held", "female", 3);
        Person noor = new Person("Noor", "Held", "female", 2);
        Person renee = new Person("Renee", "Held", "female", 1);
        Person jan = new Person("Jan", "Held", "male", 6);
        uncle.addSiblings(person);
        person.addChild(karlijn);
        person.addChild(anneloes);
        person.addChild(noor);
        person.addChild(renee);
        person.addChild(jan);
        List <Person> niecesOfUncle = uncle.getNieces();
        assertEquals(List.of(karlijn, anneloes, noor, renee), niecesOfUncle);
        }
}







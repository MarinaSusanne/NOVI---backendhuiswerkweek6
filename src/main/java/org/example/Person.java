package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;

    // methode 2 inst en declaratie in 1
    private List<Person> children = new ArrayList<>();

    private List<Pet> pets;

    public void addParents(Person mother, Person father){
        setMother(mother);
        setFather(father);
    }

    public void addChild (Person child){
        children.add(child);
    }

    public void addSiblings (Person sibling){
        siblings.add(sibling);
    }

    public List<Person> getGrandChildren (){
        ArrayList<Person> grandChildren = new ArrayList<>();
        for (Person child: children){
            for(Person grandChild : child.getChildren()){
                grandChildren.addAll(grandChild.getChildren());
            }
        }
        return grandChildren;
    }

    public void addPet (Pet pet){
        pets.add(pet);
    }


    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

   //met private constructor
    public Person(String name, String middleName, String lastName, String sex, int age) {
        this();
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    private Person(){
        pets = new ArrayList<>();
        children = new ArrayList<>();
        siblings = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

}

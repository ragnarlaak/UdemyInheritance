package com.java;

public class Animal {


    //Fields

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    //Constructors

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

    }


    //Methods

    public void eat() {
        System.out.println("NomNomNom");
    }

    public void move() {

    }




    //Getters

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

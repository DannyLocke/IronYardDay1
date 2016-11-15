package com.company;

public class Main {

    public static void main(String[] args){

        Person p = new Person("John");
        System.out.println(p.getName());

        p.setName("Ben");
        System.out.println(p.getName());

        Person.isValidName("Bob Johnson");
    }
}

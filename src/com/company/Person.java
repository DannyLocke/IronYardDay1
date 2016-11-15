package com.company;

/**
 * Created by dlocke on 11/14/16.
 */
public class Person {
    private String name;
    private int age;
    private boolean isAlive;

    public Person(){
        name = "Danny";
    }

    public Person (String n){
        name = n;
    }

    public Person (int age){

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        if(isValidName(n)){
        name = n;
        }
    }

    public static boolean isValidName (String name){
        return name.contains(" ") && !name.isEmpty() && name.length() <= 20;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        if(a>0){
        age=a;
        }
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void setAlive(boolean alive){
        isAlive = alive;
    }
}

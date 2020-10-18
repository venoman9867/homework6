package ru.geekbrains.guess_the_number;

public class Dog extends Animal{
    int Run;
    Boolean swim;
    double jump;
    Dog(String name,String color, int age, int Run,Boolean swim, double jump){
        super(age, color,name);
    }
    void Voice(){
        System.out.println(name+" Гав");

    }
    void Walk(){
        System.out.println(name+" Идет");

    }
    int getRun(){
        return Run;
    }
    double getJump(){
        return jump;
    }
    Boolean swim(){
        return swim;
    }
}

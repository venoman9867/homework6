package ru.geekbrains.guess_the_number;

public class Cat extends Animal {
    int Run;
    Boolean swim;
    int jump;
    Cat(String name,String color, int age, int Run,Boolean swim, int jump){
        super(age, color,name);
    }
    void Voice(){
        System.out.println(name+" Мяу");
    }
    void Walk(){
        System.out.println(name+" Идет на лапках");
    }
    int getRun(){
        return Run;
    }
    int getJump(){
        return jump;
    }
    Boolean swim(){
        return swim;
    }

}

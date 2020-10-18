package ru.geekbrains.guess_the_number;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat("Маруся","Белый",1,200,false,2);
	Dog dog = new Dog("Ричард","Черный",3,500,true,0.5);
	for(int i=0; i>2; i++){
		int r= 1+(int) (Math.random()*2);
		switch (r){
			case (1):
				System.out.println("Кошка пробежала "+cat.Run);
			case(2):
				System.out.println("Умеет ли кошка плавать? "+cat.swim);
			case(3):
				System.out.println("Кошка прыгнула "+cat.jump);
		}
		}
		for(int j=0; j>1; j++){
			int f= 1+(int) (Math.random()*2);
			switch (f){
				case (1):
					System.out.println("Собака пробежала "+dog.Run);
				case(2):
					System.out.println("Умеет ли песель плавать? "+dog.swim);
				case(3):
					System.out.println("Собака прыгнула "+dog.jump);
			}
		}
	}
    }



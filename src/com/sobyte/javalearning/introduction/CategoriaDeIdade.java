package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class CategoriaDeIdade {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String category;

        System.out.println("Welcome. \nFirst, for the start you need write your name in down...");
        String name = scanner.nextLine();

        System.out.printf("Very good %s, beautiful name. \nNow, how old are you?", name);
        byte age = scanner.nextByte();

        if(age < 15){
            category = "Infantil";
        } else if (age >= 15 && age <= 18){
            category = "Juvenil";
        } else {
            category = "Adulto";
        }

        System.out.printf("So %s, welcome to the category %s.", name, category);

        scanner.close();
    }
}

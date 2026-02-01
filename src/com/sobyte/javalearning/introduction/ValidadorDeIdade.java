package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class ValidadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo...");
        String name = scanner.nextLine();

        System.out.println("Agora, digite sua idade abaixo...");
        String ageStr = scanner.nextLine();

        byte age = Byte.parseByte(ageStr);

        if(age >= 18){
            System.out.printf("Olá %s, acesso liberado. \nSeja bem vindo(a)!", name);
        }
        else if(age < 18){
            System.out.printf("Desculpe %s, %d não é idade o suficiente. \nVolte daqui %d anos.", name, age, 18 - age);
        }
    }
}

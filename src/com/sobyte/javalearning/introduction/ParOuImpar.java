package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número...");
        int number = scanner.nextInt();

        boolean isPar = number % 2 == 0;
        System.out.println(isPar);

        scanner.close();
    }
}

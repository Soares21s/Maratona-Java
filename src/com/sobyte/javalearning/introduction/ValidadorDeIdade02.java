package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class ValidadorDeIdade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Agora, digite sua idade abaixo...");
        String ageStr = scanner.nextLine();

        byte age = Byte.parseByte(ageStr);

        String validador = (age < 18) ? "Acesso negado!" : "Acesso liberado!";
        System.out.println(validador);
    }
}

package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numberOne = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numberTwo = scanner.nextDouble();

        System.out.println("Agora, selecione a qual operação deseja realizar: " +
                "\n1: + " +
                "\n2: -" +
                "\n3: *" +
                "\n4: /");
        byte operation = scanner.nextByte();

        if(operation == 1){
            System.out.printf("%f + %f = %f", numberOne, numberTwo, numberOne + numberTwo);
        }else if (operation == 2){
            System.out.printf("%f - %f = %f", numberOne, numberTwo, numberOne - numberTwo);
        } else if(operation == 3){
            System.out.printf("%f * %f = %f", numberOne, numberTwo, numberOne * numberTwo);
        } else if(operation == 4) {
            if (numberTwo == 0) {
                System.out.println("Não é possivel dividir por 0.");
            } else {
                System.out.printf("%f / %f = %f", numberOne, numberTwo, numberOne / numberTwo);
            }
        }else {
            System.out.println("Está não é uma opção válida!");
        }
    }
}

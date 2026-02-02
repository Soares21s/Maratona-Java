package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class Calculadora02 {
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

        switch(operation) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", numberOne, numberTwo, numberOne+numberTwo);
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", numberOne, numberTwo, numberOne-numberTwo);
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", numberOne, numberTwo, numberOne*numberTwo);
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f\n", numberOne, numberTwo, numberOne/numberTwo);
                if(numberTwo == 0){
                    System.out.println("Não pode ser dividido por 0.");
                }
                break;

            default:
                System.out.println("Opção invalida!");
        }
    }
}

package com.sobyte.javalearning.introduction;

import java.util.Scanner;

public class AvatarCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu avatar...");
        String name = scanner.nextLine();

        System.out.println("Muito bem. \nAgora, qual será o gênero do seu avatar?");
        System.out.println("a - masculino \nb - feminino \nc - não-binário");
        String gender = scanner.nextLine().toLowerCase();

        System.out.println("Descreva o cabelo de seu avatar...");
        String hair = scanner.nextLine();

        System.out.println("Descreva o rosto...");
        String face = scanner.nextLine();

        System.out.println("Descreva as roupas (e se desejar alguma característica física)...");
        String body = scanner.nextLine();

        System.out.println("Muito bem, seu avatar foi concluído.");

        if(gender.equals("a")){
            System.out.printf("Seja muito bem-vindo %s. \nSerá uma honra ter você aqui, por agora, peço que confirme suas características.", name);
            System.out.printf("Cabelo: %s", hair);
            System.out.printf("Rosto: %s", face);
            System.out.printf("Roupas e/ou físico: %s", body);
        }
        else if(gender.equals("b")){
            System.out.printf("Seja muito bem-vinda %s. \nSerá uma honra ter você aqui, por agora, peço que confirme suas características.", name);
            System.out.printf("Cabelo: %s", hair);
            System.out.printf("Rosto: %s", face);
            System.out.printf("Roupas e/ou físico: %s", body);
        }
        else if(gender.equals("c")){
            System.out.printf("Seja muito bem-vinde %s. \nSerá uma honra ter você aqui, por agora, peço que confirme suas características.\n", name);
            System.out.printf("Cabelo: %s\n", hair);
            System.out.printf("Rosto: %s\n", face);
            System.out.printf("Roupas e/ou físico: %s\n", body);
        }
    }
}

package com.nailton.cursojavabasico.leituradados;

import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome Completo:");
        String nomeComplto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeComplto);

        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + " anos de idade");

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);
    }
}

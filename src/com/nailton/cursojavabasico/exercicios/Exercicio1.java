package com.nailton.cursojavabasico.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é: " + soma);
    }
}

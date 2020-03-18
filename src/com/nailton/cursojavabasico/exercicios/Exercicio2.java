package com.nailton.cursojavabasico.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite sua segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Digite sua terceira nota:");
        double nota3 = scan.nextDouble();

        System.out.println("Digite sua quarta nota:");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media é: " + media);
    }

}

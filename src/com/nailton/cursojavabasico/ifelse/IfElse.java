package com.nailton.cursojavabasico.ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você não é maior de idade!");
        }
        //para pular uma linha
        System.out.println();

        System.out.println("Entre com o preço do item");
        double valor = scan.nextDouble();
        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Esta muito caro!");
        }
    }
}

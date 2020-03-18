package com.nailton.cursojavabasico.breackcontinue;

import java.util.Scanner;

public class ComandoContinue {

    public static void main(String[] args) {
        //usando a classe scanner para ler o teclado
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();
        //o comando continue faz toda vez que ver o numero divisivel por 7 nao vai ser impresso na tela
        System.out.println("Digite um números interiro limite: ");
        int max = scan.nextInt();
        //este número sera divisivel por 7
        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                System.out.println("O valor divisivel por 7 é: " + i);
                continue;
            }
            System.out.println(i);
        }

    }

}

package com.nailton.cursojavabasico.breackcontinue;

import java.util.Scanner;

public class BreackContinue {

    public static void main(String[] args) {
        //usando a classe scanner para ler o teclado
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();

        System.out.println("Digite um números interiro limite: ");
        int max = scan.nextInt();
        //este número sera divisivel por 7
        for (int i = num; i <= max; i++) {
            //ate achar o primeiro número que é divisicel por 7 sairemos deste loop
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor divisivel por 7 é: " + i);
                //se caso queira achar outros numeros divivel por 7, é só tirar o breack;.
                break;
            }
        }
    }
}

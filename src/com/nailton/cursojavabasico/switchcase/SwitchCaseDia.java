package com.nailton.cursojavabasico.switchcase;

import java.util.Scanner;

public class SwitchCaseDia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número equivalenta a um dia da semana");

        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana útil");
                break;
            case 7:
            case 1:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido!");
        }

    }
}

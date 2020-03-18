package com.nailton.cursojavabasico.loopfor;

public class ForSoma {

    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i < 5; soma += i++) ;
        System.out.println("O valor da soma é: " + soma);

        for (int i = 0; i < 5; i++) {
            System.out.println("valor de i = " + i);
        }
    }
}

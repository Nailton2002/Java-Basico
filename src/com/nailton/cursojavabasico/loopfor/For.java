package com.nailton.cursojavabasico.loopfor;

public class For {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("O valor de i = " + i);
        }
        System.out.println("Valores igual e menores que 5");

        for (int i = 5; i > 0; i--) {
            System.out.println("O valor de i = " + i);
        }
        System.out.println("Outra maneira de for");
        //o for pode ser feito assim tambem
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("variavel i = " + i + "; variavel j = " + j);
        }
    }
}

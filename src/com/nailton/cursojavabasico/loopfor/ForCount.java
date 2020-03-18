package com.nailton.cursojavabasico.loopfor;

public class ForCount {

    public static void main(String[] args) {

        int count = 0;
        for (; count < 10; ) {
            System.out.println("O valor de count = " + count);
            count += 2;
        }
        //a mesma forma
        System.out.println();
        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("Valor de cont = " + cont);
        }
        //esta é a forma de um loop infinito for( ; ; ); com o bloco infinito pode danificar o computador nao é bom fazer
    }
}

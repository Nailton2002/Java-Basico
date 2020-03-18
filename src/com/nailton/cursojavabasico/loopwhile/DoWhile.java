package com.nailton.cursojavabasico.loopwhile;

public class DoWhile {

    public static void main(String[] args) {

        int i = 1; //count ou cont
        int max = 10;
        System.out.println("Contando até: " + max);
//Enquanto i for menor que o valor max incremente ate o valor max = 10
        while (i <= max) {
            System.out.println("Valor de i = " + i);
            i++;//i = i + 1; ou i += 1
        }
        System.out.println(i); //valor de i = 11

//faça enquanto ele primeiro execulta e depois avalia a expressao
        do {
            i++;
            System.out.println("Valor de i = " + i);
        } while (i < 15);
        System.out.println(i);
    }

}

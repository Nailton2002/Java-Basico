package com.nailton.cursojavabasico.breackcontinue;

//este codigo nao é utilizado no dia dia de programação por desenvolvedor java
public class BreackRotulo {
    //so a nivel de curiosidade
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            //rotulo são apenas uma identificação
            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) break rotulo1;
                        if (i == 2) break rotulo2;
                        if (i == 3) break rotulo3;
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println("valor de i: " + i);
        }
        System.out.println("saiu do loop.");
    }
}

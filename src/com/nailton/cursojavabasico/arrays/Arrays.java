package com.nailton.cursojavabasico.arrays;

public class Arrays {

    public static void main(String[] args) {
        //armazenado a temperatura de 365 dias do ano com arrays
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;//dia 01
        temperaturas[1] = 32;//dia 02
        temperaturas[2] = 33.7;//dia 03
        temperaturas[3] = 34;//dia 04
        temperaturas[4] = 31.1;//dia 05

        System.out.println("O valor da temperatura do dia 3 é = " + temperaturas[2]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        //aqui ele ira imprimir o valor do endereço de memoria do computador
        System.out.println("Valor do endereço de memoria = " + temperaturas);

        //versao padrao do for
        for (int i = 0; i < temperaturas.length; i++) {
            //vou imprimir os 365 dias do ano
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é " + temperaturas[i] + " graus");
        }
    }
}

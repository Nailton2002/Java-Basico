package com.nailton.cursojavabasico.forEach;

import java.util.Random;

public class LoopForEach {

    public static void main(String[] args) {
        //é um for para cada serve para numeros aleatorios
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {

            notas[i] = random.nextInt(10);
        }
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            System.out.println(nota);
        }
        //usando o for each para numeros aleatorios -> obs: ele nao funciona para leitura do teclado entradas de dados
        //mas serve para output saida de dados
        System.out.println("Usando o for each");
        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}

package com.nailton.cursojavabasico.matrizes;

public class Matrizes {

    public static void main(String[] args) {
        //instanciei uma matriz de 30 alunos e 4 notas
        double[][] notasAlunos = new double[3][4];
        //notas do primeiro aluno
        notasAlunos[0][0] = 10; //primeira nota do aluno
        notasAlunos[0][1] = 7;  //segunda nota do aluno
        notasAlunos[0][2] = 9;  //terceira nota do aluno
        notasAlunos[0][3] = 9.5;//quarta nota do aluno
        //notas do segundo aluno
        notasAlunos[1][0] = 9; //primeira nota do aluno
        notasAlunos[1][1] = 8;  //segunda nota do aluno
        notasAlunos[1][2] = 7;  //terceira nota do aluno
        notasAlunos[1][3] = 9;//quarta nota do aluno
        //notas do terceiro aluno
        notasAlunos[2][0] = 8; //primeira nota do aluno
        notasAlunos[2][1] = 9;  //segunda nota do aluno
        notasAlunos[2][2] = 10;  //terceira nota do aluno
        notasAlunos[2][3] = 7;//quarta nota do aluno

        //este for percorremos a primeira parte do vetor[3] que sao os alunos
        for (int i = 0; i < notasAlunos.length; i++) {
            // System.out.println(notasAlunos[i] + " "); -> desta forma imprimo o endereço de memoria do computador

            //este for percorre a segunda parte do vetor[4] que sao as notas
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            }
            System.out.println();//so para quebrar alinha
        }
        System.out.println("Calculando a media de cada aluno");
        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("media do aluno " + i + " é = " + (soma / 4));
        }
    }
}

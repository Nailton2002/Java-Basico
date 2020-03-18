package com.nailton.cursojavabasico.forEach;

public class ForEach {

    public static void main(String[] args) {
        System.out.println("Exemplo com arrays multidimensionais com for each");
        //output de uma matriz com for each
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

        for (double[] notasAluno : notasAlunos) {
            for (double nota : notasAluno) {
                System.out.println(nota + " ");
            }
            System.out.println();
        }
    }
}

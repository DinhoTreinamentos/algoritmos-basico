package br.com.parte1.basico.mediaAluno;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // Escrever um programa para calcular a média obtida por cada aluno de uma turma.
        // Deve-se informar o número de alunos da turma, o nome de cada um e as 3 notas realizadas.
        // Escrever o nome do aluno e a média obtida.
        Scanner in = new Scanner(System.in);

        int  media,alunos;
        double soma = 0;

        System.out.print("Digite a quantidades de aluno: ");
        alunos = in.nextInt();

        String [] aluno=new String[alunos];
        double[] nota = new double[3];
        for(int i=0;i < alunos;++i) {
            System.out.print("Digite o nome do aluno: ");
            aluno[i] = in.next();
            for(int j =1; j <=3;++j ){
                System.out.printf("Digite a %d nota: ",j);
                nota[j] = in.nextDouble();
                soma = nota[j] + soma;
            }
            System.out.println(" O ALUNO "+aluno[i]);
            System.out.println("\nTOTAL DA SOMA DAS NOTAS = "+soma);
            media = (int) (soma / 3);
            System.out.println("\nMÉDIA ARITIMÉTICA = " + media);
            soma = 0;


        }


    }
}

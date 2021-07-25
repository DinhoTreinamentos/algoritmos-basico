package br.com.parte1.basico.media;

import java.util.Scanner;

public class MediaFor {
    public static void main(String[] args) {
        // Faça um programa que utilize a estrutura for para ler 50 números
        // e calcule e exiba a média aritmética deles.

        Scanner in = new Scanner(System.in);
        int soma = 0, media;
        for(int i=0;i <= 50;++i) {


            System.out.println(i);
            soma = soma + i;

        }

        System.out.println("\nTOTAL DA SOMA ENTRE OS 50 NÚMEROS LÍDOS = "+soma);
        media = soma / 50;
        System.out.println("\nMÉDIA ARITIMÉTICA = " + media);
    }
}

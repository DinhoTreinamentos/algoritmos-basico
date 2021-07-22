package br.com.parte1.basico.media;

import java.util.Scanner;

public class MediaWhile {

	public static void main(String[] args) {
		// Faça um programa que utilize a estrutura while para ler 50 números 
		// e calcule e exiba a média aritmética deles.
		
		Scanner in = new Scanner(System.in);
		
		int i, soma, media;
		i = soma = 0;
		
		while(i <= 49) {
			++i;
			System.out.println(i);
			soma = soma + i;
			}
	
		System.out.println("\nTOTAL DA SOMA ENTRE OS 50 NÚMEROS LÍDOS = "+soma);
		media = soma / 50;
		System.out.println("\nMÉDIA ARITIMÉTICA = " + media);
	}
}

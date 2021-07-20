package br.com.parte1.basico.triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// Faça um programa que receba 3 valores que representarão os lados de um triângulo e verifique se 
		// os valores formam um triângulo e classifique esse triângulo como:

		// eqüilátero (3 lados iguais);
		// isósceles (2 lados iguais);
		// escaleno (3 lados diferentes).
		// Lembre-se que para formar um triângulo:
		
		// nenhum dos lados pode ser igual a zero;
		// um lado não pode ser maior do que a soma dos outros dois;
		
		int a, b, c;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Digite um valor para o lado 'A': ");
			a = in.nextInt();
			if(a == 0) {
				System.out.println("\nNENHUM LADO PODE TER O VALOR IGUAL A ZERO!\n");
				}
			}while(a == 0);
			
		do{
			System.out.print("Digite um valor para o lado 'B': ");
			b = in.nextInt();
			if(b == 0) {
				System.out.println("\nNENHUM LADO PODE TER O VALOR IGUAL A ZERO!\n");
				}
		}while(b == 0);
			
		do {	
			System.out.print("Digite um valor para o lado 'C': ");
			c = in.nextInt();
			if(c == 0) {
				System.out.println("\nNENHUM LADO PODE TER O VALOR IGUAL A ZERO!\n");
				}
		}while(c == 0);			
		
		if(a > b + c || b > a + c || c > a + b) {
			System.out.println("\nNÃO FOI POSSÍVEL FORMAR UM TRIÂNGULO!"
					+ "\nUM LADO NÃO PODE SER MAIOR DO QUE A SOMA DOS OUTROS DOIS LADOS!!!");
		}else if(a == b && b == c) {
			System.out.println("\nTRIÂNGULO EQUILÁTERO");
		}else if(a == b && b != c) {
			System.out.println("\nTRIÂNGULO ISÓSCELES");
		}else {
			System.out.println("\nTRIÂNGULO ESCALENO");
		}
	}

}

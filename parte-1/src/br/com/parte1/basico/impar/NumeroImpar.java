package br.com.parte1.basico.impar;

import java.util.Scanner;

public class NumeroImpar {

	public static void main(String[] args) {
		// Faça um programa que verifique se um número é impar.
		int num, resultado;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num =in.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("O número digitado ñ ímpar.");
		}else {
			System.out.println("O número digitado é impar.");
		}

	}

}

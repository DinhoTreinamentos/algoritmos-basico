package br.com.parte1.basico.maiorvalor;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		// Faça um programa que receba 2 valores e retorne o maior entre eles.
		int num1, num2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		num1 = in.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = in.nextInt();
		
		if(num1 > num2) {
			System.out.println("\nO maior valor digitado foi " + num1);
		}else {
			System.out.println("O maior valor digitado foi " + num2);
		}

	}

}

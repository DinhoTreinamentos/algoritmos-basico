package br.com.parte1.basico.menorvalor;

import java.util.Scanner;

public class MenorValor {

	public static void main(String[] args) {
		// Faça um programa que receba 4 valores e retorne o menor entre eles.
		int num1, num2, num3, num4;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor: ");
		num1 =in.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		num2 =in.nextInt();
		
		System.out.print("Digite o 3º valor: ");
		num3 =in.nextInt();
		
		System.out.print("Digite o 4º valor: ");
		num4 =in.nextInt();
		
		//if(num1 < num2 && num1 < num3 && num1 < num4) {
		//	System.out.println("\nO menor valor digitado foi " + num1);
		//}else if(num2 < num1 && num2 < num3 && num2 < num4) {
		//	System.out.println("\nO menor valor digitado foi " + num2);
		//}else if(num3 < num1 && num3 < num2 && num3 < num4) {
		//	System.out.println("\nO menor valor digitado foi " + num3);
		//}else{
		//	System.out.println("\nO menor valor digitado foi " + num4);
		//}
		
		String j = (num1 < num2 && num1 < num3 && num1 < num4) ? "\nO menor valor digitado foi " + num1:
			(num2 < num1 && num2 < num3 && num2 < num4) ? "\nO menor valor digitado foi " + num2:
				(num3 < num1 && num3 < num2 && num3 < num4) ? "\nO menor valor digitado foi " + num3:
					"\nO menor valor digitado foi " + num4;
		System.out.println(j);
	}
}

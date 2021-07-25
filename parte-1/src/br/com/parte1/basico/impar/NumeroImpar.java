package br.com.parte1.basico.impar;

import java.util.Scanner;

public class NumeroImpar {

	private static final String NUMERO_IMPAR = "O número digitado é Ímpar.";
	private static final String NUMERO_PAR = "O número digitado é Par.";

	public static void main(String[] args) {
		// Faça um programa que verifique se um número é impar.
		int num;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = in.nextInt();
		
		//if(num % 2 == 0) {
		//	System.out.println("O número digitado não ímpar.");
		//}else {
		//	System.out.println("O número digitado é impar.");
		//}
		
		String j = (num % 2 == 0) ? NUMERO_PAR : NUMERO_IMPAR;
		System.out.println(j);
		
		
	}
}

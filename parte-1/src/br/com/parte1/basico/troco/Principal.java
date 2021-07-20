package br.com.parte1.basico.troco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço do produto
		// e retorne o troco a ser dado.
		
		double pago, preco, troco;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Valor pago R$ ");
		pago = in.nextDouble();
		
		System.out.print("Preço R$ ");
		preco = in.nextDouble();
		
		troco = pago - preco;
		
		System.out.print("Troco R$ " + troco);
		
	}
}

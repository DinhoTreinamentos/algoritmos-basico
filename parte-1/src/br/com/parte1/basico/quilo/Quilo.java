package br.com.parte1.basico.quilo;

import java.util.Scanner;

public class Quilo {

	public static void main(String[] args) {
		// Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do produto consumida
		// calculando o valor final a ser pago.
		
		double kgProduto, quantKg, valorPg;
		kgProduto = quantKg = valorPg = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Kg do Produto R$ ");
		kgProduto = in.nextDouble();
		
		System.out.print("Peso: ");
		quantKg = in.nextDouble();
		
		valorPg = quantKg * kgProduto;
		
		System.out.print("Valor a ser pago: R$ " + valorPg);
		
	}

}

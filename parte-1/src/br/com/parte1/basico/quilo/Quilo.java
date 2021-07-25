package br.com.parte1.basico.quilo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quilo {

	private static final String VALOR_A_SER_PAGO_R$ = "Valor a ser pago: R$ ";

	public static void main(String[] args) {
		// Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do produto consumida
		// calculando o valor final a ser pago.
		
		double kgProduto, quantidadeKg, valorPg;
		kgProduto = quantidadeKg = valorPg = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Kg do Produto R$ ");
		kgProduto = in.nextDouble();
		
		System.out.print("Peso: ");
		quantidadeKg = in.nextDouble();
		
		valorPg = quantidadeKg * kgProduto;
		DecimalFormat formato = new DecimalFormat("#0.00");
		System.out.println(VALOR_A_SER_PAGO_R$ + formato.format(valorPg));
		System.out.println(VALOR_A_SER_PAGO_R$ + String.format("%.2f",valorPg));
		System.out.println(VALOR_A_SER_PAGO_R$ + new DecimalFormat("#0.00").format(valorPg));
		
	}

}

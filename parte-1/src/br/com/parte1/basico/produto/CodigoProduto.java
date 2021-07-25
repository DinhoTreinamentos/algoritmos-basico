package br.com.parte1.basico.produto;

import java.util.Scanner;

public class CodigoProduto {

	public static void main(String[] args) {
		// Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do código do mesmo.
		// Considere os seguintes códigos:

		// 001  Parafuso; 
		// 002  Porca; 
		// 003  Prego; 
		// Para qualquer outro código indicar ?Diversos?. 
		// Refaça o exercício anterior usando a estrutura switch.
		
		int codigo;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o código: ");
		codigo = in.nextInt();
		
		//if(codigo == 001) {
		//	System.out.println("Parafuso");
		//}else if(codigo == 002) {
		//	System.out.println("Porca");
		//}else if(codigo == 003) {
		//	System.out.println("Prego");
		//}else {
		//	System.out.println("Diversos");
		//}	
		
		//switch(codigo) { 
		//	case 001 : 
		//		System.out.println("Parafuso");
		//		break;
		//	case 002 : 
		//		System.out.println("Porca");
		//		break;
		//	case 003 : 
		//		System.out.println("Prego");
		//		break;
		//	default  : 
		//		System.out.println("Diversos");
		//}
		
		String peca=(codigo==001)?"Parafuso":(codigo==002)?"Porca":(codigo==003)?"Prego":"Diversos";
		System.out.println(peca);

	}
}

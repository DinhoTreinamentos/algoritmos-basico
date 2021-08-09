package br.com.parte1.basico.sequenciavalorinteiro;
import java.util.Scanner;

public class inteiroPositivo {
//    Escrever um programa que, dada uma seqüência de valores inteiros e positivos,
//    determine qual e o menor valor desta sequência
//    e a média aritmética dos valores pares.
//    O valor 0 (zero) indica o término dos dados de entrada (finalizador).

    public static void main(String[] args) {
        // declaracão de variaveis
        Scanner in = new Scanner(System.in);
        int numeros ,i=0;

        do {
            ++i;
            System.out.print("Digite um numero: ");
            numeros = in.nextInt();
            System.out.println(i);
            if(numeros>0){
                System.out.println("Quando quiser para de Digitar basta digitar o ZERO");
            }
        }while(numeros > 0);



    }
}

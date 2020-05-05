package exercicio1;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double valor;
		
		System.out.println("digite o valor do produto");
		valor = leitor.nextInt();
		
		
		 if(valor < 20) { ;
		System.out.println("O valor de venda e de " +valor * 1.45);
		 
		 }
		 else {
			 System.out.println("O valor de venda e de" +valor *1.30);
		 }

		
		 }
}



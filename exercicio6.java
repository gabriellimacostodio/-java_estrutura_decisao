package exercicio1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1, n2 ,n3;
		int soma;
		
		System.out.println("digite nota 1");
		n1 = leitor.nextInt();
		
		System.out.println("digite nota 2");
		n2 = leitor.nextInt();
		
		System.out.println("digite nota 3");
		n3 = leitor.nextInt();
		
		System.out.println(n1+n2+n3);
		
		if( n1+n2+n3 >= 7 ) { ; 
			System.out.println("aluno aprovado");
		}
		
		else {
			System.out.println("aluno reprovado");
		

		}

	}	
}
	

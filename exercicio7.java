package exercicio1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n1, n2 ; 
		String nome1 ;
		String nome2 ; 
		
		
		System.out.println("digite seu nome 1");
		nome1 = leitor.next();
		
		System.out.println("digite sua idade");
		n1 = leitor.nextInt();
		
		System.out.println("digite seu nome 2");
		nome2 =leitor.next();
		System.out.println("digite sua idade");
		n2 = leitor.nextInt();
		
		if(n1 < n2 ) {	
			System.out.println("boas vindas, senhor(a)"+ nome2 );
			System.out.println("sua idade é "+ n2);
		}else{
			System.out.println("boas vinddas, senhor(a)"+ nome1 );
			System.out.println("sua idade é "+ n1);
			
			System.out.println("E voçê foi o mais velho entre os dois ");
			

		}
	}
}



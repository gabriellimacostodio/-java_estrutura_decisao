package exercicio1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
					
			int n1 , n2 ;
			int maior ;
			int soma ;
					
			System.out.println("digite o  numero 1");
			n1= leitor.nextInt();
			
			System.out.println("digite o  numero 2");
			n2= leitor.nextInt();
					
			soma = n1 +n2;
					
					
			if(soma >10) {
				maior = n1;
			System.out.println("resultado: "+soma);
			}else{ 
			System.out.println("soma menor 10");
						
					
					
					}
					

	}

}

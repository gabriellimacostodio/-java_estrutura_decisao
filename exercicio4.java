package exercicio1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in) ;
		
		int n1, n2 ; 
		
		System.out.println("digite numero 1");
		n1 = leitor.nextInt();
		
		System.out.println("digite numero 2");
		n2 = leitor.nextInt();
		
		if(n1 < n2 ) {
			System.out.println(n2);
			System.out.println(n1);
		}else{
			System.out.println(n1);
			System.out.println(n2);
		}
	}

}

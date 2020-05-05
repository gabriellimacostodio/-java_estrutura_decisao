package exercicio1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int n1;
		
		System.out.println("digite um numero inteiro ");
		n1 = leitor.nextInt();
		
		if(n1 % 2 ==0 ) {
			
			System.out.print(+n1 );
			System.out.println(" é par");
		}else{
			System.out.print( +n1);
			System.out.println(" é impar");
		
		}
		
		
	}

}



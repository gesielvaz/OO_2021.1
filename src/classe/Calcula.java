package classe;

import java.util.Scanner;

public class Calcula {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, soma;
		
		System.out.println("Entre com o primeiro numero: ");
		numero1 = input.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		numero2 = input.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("O resultado é %d%n",soma);
		
		input.close();
	}

}

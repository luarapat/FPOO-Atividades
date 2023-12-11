package Atividade_Luara_Patracon;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		int menor = 0;
		int numero;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("digite numeros positivos e negativos:");
			boolean primeiro_numero = true;
			while (true) {
			numero = entrada.nextInt();
			if (numero == 0) {
				break;
			} if (primeiro_numero) {
				menor = numero;
				primeiro_numero = false;
			} else if (numero < menor) {
				menor = numero;
			}
			if (primeiro_numero) {
				System.out.println("nenhum numero foi digitado");
			} else {
				System.out.println("o menor numero digitado foi..." + menor);
				
			}
}
		}
	
}
}

	


	



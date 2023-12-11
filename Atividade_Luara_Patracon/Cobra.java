package Atividade_Luara_Patracon;
import java.util.Scanner;
public class Cobra {

	public static void main(String[] args) {

	        try (Scanner entrada = new Scanner(System.in)) {
				System.out.println("escreva a sequencia:");

				int [] numeros = new int[4];//numeros da sequencia

				for(int i = 0; i < 4; i++) {
				    numeros[i] = entrada.nextInt();
				}

				if (numeros[0] == numeros[2] || numeros[1] == numeros[3]) {
				    System.out.println("V");
				}

				else {
				    System.out.println("F");
				}
			}

	        //cobras falsas tem o intervalo de dois nums entre os iguais 3 9 5 3

	    }
	}


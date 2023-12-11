package Atividade_Luara_Patracon;
import java.util.Scanner;
public class soma_positivos {

	public static void main(String[] args) {
		int soma=0;
		int num;
		try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("digite valores positivos para somá-los");
			while (true) {
			   num = entrada.nextInt();
				if (num <= 0) {
					break;
				}

			soma = soma + num;
			System.out.println("resultado "+soma);
}
		}

	}
}

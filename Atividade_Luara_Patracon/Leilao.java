package Atividade_Luara_Patracon;
import java.util.Scanner;
public class Leilao {

	public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o numero de lances recebidos: ");

			int n = input.nextInt();
			input.nextLine(); 
			String nomeVencedor = "";
			int maiorLance = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {

			    System.out.println("Lance " + (i + 1) + ":");
			    String nome = input.nextLine();
			    int lance = input.nextInt();

			    input.nextLine(); 

			    if (lance > maiorLance || (lance == maiorLance && i == 0)) {
			        nomeVencedor = nome;
			        maiorLance = lance;
			    }
			}
			System.out.println("Vencedor: " + nomeVencedor);
			System.out.println("Valor do lance vencedor:" + maiorLance);
		}
    }
}

package Atividade_Luara_Patracon;
import java.util.Scanner;
public class Tesouro {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int moedas = entrada.nextInt();
	int marinheiros = entrada.nextInt();
	int capitao, divisão; // divisao é a qnt q os marinheiros vao receber
	
	capitao = 2;
	divisão = moedas/(marinheiros+capitao);
	System.out.println("quantidde para o olho=" + 2*divisão);
	
	
	}

}

package Atividade_Luara_Patracon;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
	try (Scanner entrada = new Scanner (System.in)) {
		int amiga1 = entrada.nextInt();
		int amiga2 = entrada.nextInt();
		int valor_ingresso = 0;
		
		if (amiga1 < 18) 
			valor_ingresso = valor_ingresso + 15;
			else if (amiga1 < 60) 
				valor_ingresso = valor_ingresso + 30;
			 else 
				valor_ingresso =  valor_ingresso + 20;
		
		if (amiga2 < 18) 
			valor_ingresso = valor_ingresso + 15;
			else if (amiga2 < 60) 
				valor_ingresso = valor_ingresso + 30;
			 else 
				valor_ingresso =  valor_ingresso + 20;
		System.out.println("valor total = " + valor_ingresso);
	}
	}

	}



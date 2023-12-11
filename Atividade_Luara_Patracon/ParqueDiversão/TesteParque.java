package ParqueDiversão;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Brinquedos b1 = new Brinquedos();
		b1.setAlturaMinima(entrada.nextDouble());
		b1.setNome(entrada.next());
		b1.setAlt(entrada.nextInt());
		
		Visitante v1 = new Visitante(0, 0, null);
		v1.altMin(entrada.next());
		v1.setIdade(entrada.nextInt());
		
		
	}
}
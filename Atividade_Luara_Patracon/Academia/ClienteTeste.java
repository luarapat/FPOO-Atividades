package Academia;

import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cliente c1 = new Cliente ();
		c1.CPF = entrada.nextInt();
		c1.alt = entrada.nextFloat();
		c1.idade = entrada.nextInt();
		c1.telefone = entrada.nextInt();
		c1.peso = entrada.nextFloat();
		c1.pesodesejado = entrada.nextFloat();
		c1.nome = entrada.next();
		System.out.println(c1.getImprimirDados());


	}

}

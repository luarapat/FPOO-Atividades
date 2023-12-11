package Atividade_Luara_Patracon;
import java.util.Scanner;
public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//instanciando o cliente
		Cliente c1 = new Cliente();
		System.out.println("Bem vindo! Informe Seu nome, sobrenome e email");
		c1.setNome(entrada.nextLine());
		
		c1.setSobrenome(entrada.nextLine());
		c1.setEmail(entrada.nextLine());
		System.out.println("INFORMACOES \n Nome:" + c1.getNome() + "\n Sobrenome: " +
		c1.getSobrenome() + "\n Email: " + c1.getEmail());
		//instanciando os voos
		Voo v1 = new Voo();
		Voo v2 = new Voo();
		Voo v3 = new Voo();
		System.out.println("Voce comprou a passagem! Informe o numero do voo, sua origem, destino"
				+ " e preco");
		v1.setNumeroVoo(entrada.next());
		v1.setOrigem(entrada.next());
		v1.setDestino(entrada.next());
		v1.setPreco(entrada.nextDouble());
		System.out.println("INFORMACOES \n Numero do voo:" + v1.getNumeroVoo() + "\n Origem: " +
				v1.getOrigem() + "\n Destino: " + v1.getDestino() +" \n Preco:" + v1.getPreco());
		//instanciando uma passagem
		Passagem p1 = new Passagem(v1, c1);
	    p1.getCliente();
	    p1.getVoo();
	    p1.getPrecoTotal();
	    System.out.println(p1.toString());
	    //intanciando uma segunda passagem com o voo 2
	    Passagem p2 = new Passagem(v2, c1);
	    p2.getCliente();
	    p2.getVoo();
	    p2.getPrecoTotal();
	    System.out.println(p2.toString());
	    //instanciando a ultima passagem com o voo 3
	    Passagem p3 = new Passagem(v3, c1);
	    p3.getCliente();
	    p3.getVoo();
	    p3.getPrecoTotal();
	    System.out.println(p3.toString());
	   
	}
}

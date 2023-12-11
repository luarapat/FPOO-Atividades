package Cachorro;

import java.util.Scanner;

public class TesteCao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	//instanciamento de objetos
	Cachorro c1 = new Cachorro();
	Cachorro c2 = new Cachorro();
	Cachorro c3 = new Cachorro();
	//o que estao fazendo
	System.out.println("Bem vindo ao canil! Voce deseja adotar um cachorro?Temos algumas opções!");
	c1.setNome("Luke");
	c1.setPeso(24);
	c1.setSexo('M');
	c1.setQtdPatas(4);
	System.out.println("informacoes: " + c1.getNome() + ", " + c1.getPeso()+ " Kg" + ", sexo: " +
	c1.getSexo()+", "+ c1.getQtdPatas()+ " patas.");
	System.out.println("Deseja ver outro?");
	c2.setNome("Max");
	c2.setPeso(21);
	c2.setSexo('M');
	c2.setQtdPatas(4);
	System.out.println("informacoes: " + c2.getNome() + ", " + c2.getPeso()+ " Kg" + ", sexo: " +
	c2.getSexo()+", "+ c2.getQtdPatas()+ " patas.");
	System.out.println("Por ultimo, temos essa!");
	c3.setNome("Tina");
	c3.setPeso(18);
	c3.setSexo('F');
	c3.setQtdPatas(4);
	System.out.println("informacoes: " + c3.getNome() + ", " + c3.getPeso()+ " Kg" + ", sexo: " +
	c3.getSexo()+", "+ c3.getQtdPatas()+ " patas.");
	
}
}
package Atividade_Luara_Patracon;
import java.util.Scanner;
public class TesteCasa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//primeira casa
		Casa c1 = new Casa();
		System.out.println("Vamos lá! Qual é a cor de sua casa?");
		c1.setCor(entrada.next());
		System.out.println("Ótimo! Qual seria o seu orçamento?");
		c1.setpreco(entrada.nextFloat());
		System.out.println("e sua metragem?");
		c1.setMetragem(entrada.nextFloat());
		c1.mostrarDetalhes();
		//quartos e salas
		Quarto q1 = new Quarto();
		Sala s1 = new Sala();
		System.out.println("Agora o quarto!");
		System.out.println("qual é o nome dele?");
		q1.setNome(entrada.next());
		System.out.println("Quantas camas ele tem?");
		q1.setNumeroCamas(entrada.nextInt());
		System.out.println("Seu quarto "+q1.getNome()+" possui " + q1.getNumeroCamas() + " camas");
		System.out.println("E a sala, qual será seu nome?");
		s1.setNome(entrada.next());
		System.out.println("E ela possui TV?");
		s1.setTemTV(entrada.nextBoolean());
		System.out.println("então é uma sala " + s1.getNome());
		s1.temTV();
		
		//segunda casa
		//primeira casa
		Casa c2 = new Casa();
		System.out.println("Vamos lá! Qual é a cor de sua casa?");
		c2.setCor(entrada.next());
		System.out.println("Ótimo! Qual seria o seu orçamento?");
		c2.setpreco(entrada.nextFloat());
		System.out.println("e sua metragem?");
		c2.setMetragem(entrada.nextFloat());
		c2.mostrarDetalhes();
		//quartos e salas
		Quarto q2 = new Quarto();
		Sala s2 = new Sala();
		System.out.println("Agora o quarto!");
		System.out.println("qual é o nome dele?");
	    q2.setNome(entrada.next());
		System.out.println("Quantas camas ele tem?");
		q2.setNumeroCamas(entrada.nextInt());
		System.out.println("Seu quarto "+q2.getNome()+" possui " + q2.getNumeroCamas() + " camas");
		System.out.println("E a sala, qual será seu nome?");
		s2.setNome(entrada.next());
		System.out.println("E ela possui TV?");
		s2.setTemTV(entrada.nextBoolean());
		System.out.println("então é uma sala " + s2.getNome());
		s2.temTV();
		
}

}

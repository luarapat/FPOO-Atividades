package Atividade_Luara_Patracon;
import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;
public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//banda 1
		Banda b1 = new Banda ();
		System.out.println("Vamos ver o show da sua banda favorita! Qual o nome dela?");
		b1.setNome(entrada.next());
		b1.adicionarMembro();
		//membros
		MembroBanda v = new MembroBanda();
		MembroBanda bx = new MembroBanda();
		MembroBanda ba = new MembroBanda();
		MembroBanda gu = new MembroBanda();
		System.out.println("Qual o nome do vocalista?");
		String vocalista = entrada.next();
		v.setNome(vocalista);
		System.out.println("Qual o nome do baixista?");
		String baixista = entrada.next();
		bx.setNome(baixista);
		System.out.println("e o baterista?");
		String baterista = entrada.next();
		ba.setNome(baterista);
		System.out.println("E o guitarrista?");
		String guitarrista = entrada.next();
		gu.setNome(guitarrista);
		List <MembroBanda> membros = new ArrayList <MembroBanda> ();
			membros.add(v);
			membros.add(bx);
			membros.add(ba);
			membros.add(gu);
		for (MembroBanda vv: membros) {
			System.out.println("os membros são:" + vv.getNome() );
		}
		//tocando
		Vocalista  v1 = new Vocalista();
		Baixista bs = new Baixista();
		Baterista bt = new Baterista();
		Guitarrista grr = new Guitarrista();
		v1.vtocar();
		bs.btocar();
		bt.Btocar();
		grr.gtocar();
		//realinzando show
		b1.realizarShow();
		System.out.println("A banda " + b1.getNome() + " é incrível");
	}

}

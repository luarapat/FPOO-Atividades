package Atividade_Luara_Patracon;

import java.util.Scanner;

public class TestHerança {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//instanciar obj da classe 1
		Aluno a1 = new Aluno();
		a1.setNome(entrada.next());
		a1.setEndereço(entrada.next());
		a1.setTelefone(entrada.nextInt());
		a1.setCpf(entrada.nextInt());
		a1.setCelular(entrada.nextInt());
		a1.setCurso(entrada.next());
		a1.setNota1(entrada.nextInt());
		a1.setNota2(entrada.nextInt());
		a1.calcularmedia();
		
		Aluno a2 = new Aluno();
		a2.setNome(entrada.next());
		a2.setEndereço(entrada.next());
		a2.setTelefone(entrada.nextInt());
		a2.setCpf(entrada.nextInt());
		a2.setCelular(entrada.nextInt());
		a2.setCurso(entrada.next());
		a2.setNota1(entrada.nextInt());
		a2.setNota2(entrada.nextInt());
		a2.calcularmedia();
		
		Professor p1 = new Professor();
		p1.setNome(entrada.next());
		p1.setEndereço(entrada.next());
		p1.setTelefone(entrada.nextInt());
		p1.setCpf(entrada.nextInt());
		p1.setCelular(entrada.nextInt());
		p1.setNomeCurso(entrada.next());
		p1.setSalario(entrada.nextFloat());
		
		Professor p2 = new Professor();
		p2.setNome(entrada.next());
		p2.setEndereço(entrada.next());
		p2.setTelefone(entrada.nextInt());
		p2.setCpf(entrada.nextInt());
		p2.setCelular(entrada.nextInt());
		p2.setNomeCurso(entrada.next());
		p2.setSalario(entrada.nextFloat());
		
		System.out.println("dados dos alunos");
		System.out.println("aluno 1");
		System.out.println("nome" + a1.getNome());
		System.out.println("endereço" + a1.getEndereço());
		System.out.println("telefone" + a1.getTelefone());
		System.out.println("cpf" + a1.getCpf());
		System.out.println("celular" + a1.getCelular());
		System.out.println("curso" + a1.getCurso());
		a1.situacaoAluno();
		System.out.println("media" + a1.media);
		
		System.out.println("dados dos alunos");
		System.out.println("aluno 2");
		System.out.println("nome" + a2.getNome());
		System.out.println("endereço" + a2.getEndereço());
		System.out.println("telefone" + a2.getTelefone());
		System.out.println("cpf" + a2.getCpf());
		System.out.println("celular" + a2.getCelular());
		a2.situacaoAluno();
		System.out.println("media" + a2.media);
		
		System.out.println("dados dos professores");
		System.out.println("professor 1");
		System.out.println("nome" + p1.getNome());
		System.out.println("endereço" + p1.getEndereço());
		System.out.println("telefone" + p1.getTelefone());
		System.out.println("cpf" + p1.getCpf());
		System.out.println("celular" + p1.getCelular());
		System.out.println("curso" + p1.getNomeCurso());
		System.out.println("salario" + p1.getSalario());
		
		System.out.println("dados dos professores");
		System.out.println("professor 2");
		System.out.println("nome" + p2.getNome());
		System.out.println("endereço" + p2.getEndereço());
		System.out.println("telefone" + p2.getTelefone());
		System.out.println("cpf" + p2.getCpf());
		System.out.println("celular" + p2.getCelular());
		System.out.println("curso" + p2.getNomeCurso());
		System.out.println("salario" + p2.getSalario());
	}

}

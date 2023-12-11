package Astronomia;
import java.util.Scanner;
public class TesteAstronomia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Funcionário f1 = new Funcionário();
		System.out.println("Bem vindo a NASA!Acompanhe um dos nossos projetos...");
		System.out.println("Com qual professor voce deseja acompanhar?");
		f1.setNome(entrada.next());
		f1.setRegistro("16524");
		System.out.println("Muito bem! Acompanhe o " + f1.getNome() + " com numero de registro "
		+ f1.getRegistro());
		f1.estudar();
		System.out.println("Ele encontrou algo em Marte, mas precisa de suas máquinas para ter certeza!");
		Maquina1 m1 = new Maquina1();
		Maquina2 m2 = new Maquina2();
		m1.trabalhar();
		m2.analisar();
		m2.especionar();
		m1.coletarDados();
		m1.exibirDados();
		System.out.println("Com tudo coletado, vamos lançar o objeto para la, assim monitoramos as descobertas!");
		f1.lancarObjeto();
	}

}

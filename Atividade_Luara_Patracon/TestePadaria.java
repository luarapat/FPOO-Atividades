package Atividade_Luara_Patracon;
import java.util.Scanner;
public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Bem vindo a padaria da vó Luara, faça seu pedido!");
		//instanciamento de paes
		System.out.println("que tipo de paes voce quer?");
		Pao p1 = new Pao ();
		Pao p2 = new Pao();
		p1.setNome(entrada.next());
		p1.setPreco(entrada.nextDouble());
        System.out.println("seu pedido e um pao "+ p1.getNome() + " que custa " + p1.getPreco());
        p2.setNome(entrada.next());
		p2.setPreco(entrada.nextDouble());
        System.out.println("seu pedido e um pao "+ p2.getNome() + " que custa " + p2.getPreco());
        //instanciamento de bolos
        System.out.println("que tipo de bolos voce quer?");
        Bolo b1 = new Bolo();
		Bolo b2 = new Bolo();
		b1.setNome(entrada.next());
		b1.setPreco(entrada.nextDouble());
        System.out.println("seu pedido e um bolo de  "+ b1.getNome() + " que custa " + b1.getPreco());
        b2.setNome(entrada.next());
		b2.setPreco(entrada.nextDouble());
        System.out.println("seu pedido e um bolo de  "+ b2.getNome() + " que custa " + b2.getPreco());
        //instanciamento de doces
        System.out.println("que tipo de doces voce quer?");
        Doce d1 = new Doce();
		Doce d2 = new Doce();
		d1.setNome(entrada.next());
		d1.setPreco(entrada.nextDouble());
        System.out.println("seu pedido e um  "+ d1.getNome() + " que custa " + d1.getPreco());
        d2.setNome(entrada.next());
		d2.setPreco(entrada.nextDouble());
        System.out.println("seu pedido e um  "+ d2.getNome() + " que custa " + d2.getPreco());
        //pica pau comendo
        PicaPau hehehehe = new PicaPau();
        hehehehe.comer();
        p1.setNome(entrada.next());
        b1.setNome(entrada.next());
        d1.setNome(entrada.next());
        System.out.println("um " + p1.getNome() + ", um " + b1.getNome()+ " e dois " + d1.getNome());
        hehehehe.opiniao();
	}

}

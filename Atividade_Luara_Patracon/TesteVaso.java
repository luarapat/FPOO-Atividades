package Atividade_Luara_Patracon;
import java.util.Scanner;

public class TesteVaso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//objeto1 vaso simples
		Vaso jorgina = new Vaso();
		System.out.println("como é o seu vaso?(cor, tamanho e material)");
		String cors = entrada.nextLine();
		jorgina.setCor(cors);
		System.out.println("tem a cor "+ jorgina.getCor());
		double tamanhos = entrada.nextDouble();
		jorgina.setTamanho(tamanhos);
		System.out.println("tem o tamanho "+ jorgina.getTamanho());
		String materials = entrada.next();
		jorgina.setMaterial(materials);
		System.out.println("foi feito de "+ jorgina.getMaterial());
		
		//objeto2 vaso simples
		Vaso jaime = new Vaso();
		System.out.println("como é o seu vaso?(cor, tamanho e material)");
	    String cores = entrada.nextLine();
	    jaime.setCor(cores);
		System.out.println("tem a cor "+ jaime.getCor());
		double tamanhoss = entrada.nextDouble();
		jaime.setTamanho(tamanhoss);
		System.out.println("tem o tamanho "+ jaime.getTamanho());
		String materialss = entrada.next();
		jaime.setMaterial(materialss);
		System.out.println("foi feito de"+ jaime.getMaterial());
		
		//objeto vaso decorado
		VasoDecorado créu = new VasoDecorado();
		System.out.println("como é o seu vaso?(cor, tamanho e material) E a sua decoracao?");
	    String cor = entrada.nextLine();
	    créu.setCor(cor);
		System.out.println("tem a cor "+ créu.getCor());
		double tamanho = entrada.nextDouble();
		créu.setTamanho(tamanho);
		System.out.println("tem o tamanho"+ créu.getTamanho());
		String material = entrada.next();
		créu.setMaterial(material);
		System.out.println("foi feito de "+ créu.getMaterial());
		String decoracao = entrada.nextLine();
		créu.setDecoracao(decoracao);
		System.out.println("sua decoracao tem "+ créu.getDecoracao());
		
		//objeto 2 vaso decorado
		VasoDecorado soraia = new VasoDecorado();
		System.out.println("como é o seu vaso?(cor, tamanho e material) E a sua decoracao?");
		String corr = entrada.nextLine();
	    soraia.setCor(corr);
		System.out.println("tem a cor "+ soraia.getCor());
		double tamanhoo = entrada.nextDouble();
		soraia.setTamanho(tamanhoo);
		System.out.println("tem o tamanho "+ soraia.getTamanho());
		String materiall = entrada.next();
		soraia.setMaterial(materiall);
		System.out.println("foi feito de "+ soraia.getMaterial());
		String decoracaoo = entrada.nextLine();
		soraia.setDecoracao(decoracaoo);
		System.out.println("sua decoracao tem "+ soraia.getDecoracao());
}
	
	
}

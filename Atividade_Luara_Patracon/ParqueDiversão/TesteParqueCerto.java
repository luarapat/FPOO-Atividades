package ParqueDiversão;
import java.util.Scanner;
public class TesteParqueCerto {

	public static void main(String[] args) {
		//Scanner e System (permite entrada de dados)
		Scanner entrada = new Scanner (System.in);
		//instancia de objetos 
		System.out.println("informe os dados do brinquedo 1");
		System.out.println("Nome: ");
		String nomeMontanhaRussa = entrada.nextLine(); //pega a linha inteira da String
		System.out.println("Altura Mínima: (em metros)");
		double alturaMinimaMontanhaRussa = entrada.nextDouble();
		System.out.println("Capacidade Máxima:");
		int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		//agora estamos instanciando obj de classe BRINQUEDO
		Brinquedos montanhaRussa = new Brinquedos(nomeMontanhaRussa, alturaMinimaMontanhaRussa, capacidadeMaximaMontanhaRussa);
		montanhaRussa.exibirInfo();
		// ****** instanciar o segundo brinquedo *********
		
		System.out.println("informe os dados do visitante 1");
		System.out.println("Nome:");
		entrada.nextLine();
		String nomeVisitante1 = entrada.nextLine();
		System.out.println("Idade:");
		int idadeVisitante1 = entrada.nextInt();
		System.out.println("Altura:");
		double alturaVisitante1 = entrada.nextDouble();
		//instancia do objeto visitante1
		Visitante vis1 = new Visitante();
		Visitante visitante1 = new Visitante(idadeVisitante1, alturaVisitante1, nomeVisitante1);
		System.out.println("informações do brinquedo 1:");
		montanhaRussa.exibirInfo();
		
		System.out.println("informações do visitante 1:");
		visitante1.exibirInfo();
		//vamos verificar se o visitante pode ou nao entrar no brinquedo
		System.out.println("Pode andar na montanha Russa?" +
		(visitante1.podeAndarNoBrinquedo()? "Sim" : "Nao"));
		
		
}

}

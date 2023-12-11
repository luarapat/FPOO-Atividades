package Atividade_Luara_Patracon;
import java.util.List;

public class Banda {
	//atributos
	private String nome;
	private List<MembroBanda> membros;
	
	//construtores
	public Banda () {
		
	}
	public Banda(String nome, List<MembroBanda> membros) {
		this.nome=nome;
		this.membros=membros;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public List<?> getMembros() {
		return membros;
	}
	public void setMembros(List<MembroBanda> membros) {
		this.membros=membros;
	}
	//métodos
	public void adicionarMembro() {
		System.out.println("Quero conhecer a banda! Quais são os membros?");
	}
	public void realizarShow() {
		System.out.println("Eles tocaram muito! O show foi muito bom!");
	}
}

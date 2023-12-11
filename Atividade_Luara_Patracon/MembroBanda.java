package Atividade_Luara_Patracon;

import java.util.List;

public class MembroBanda extends Banda {
	//atributos
	private String nomes;
	
	//construtores
	public MembroBanda() {
		
	}
	public MembroBanda(String nome, List<?> membros, String nomes) {
		super();
		this.nomes=nomes;
	}
	//getters e setters
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes=nomes;
	}
	//método
	public void tocar() {
		
	}
}

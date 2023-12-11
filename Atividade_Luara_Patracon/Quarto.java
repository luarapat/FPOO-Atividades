package Atividade_Luara_Patracon;

public class Quarto extends Comodo {
	//atributos
	private int numeroCamas;
	
	//construtores
	public Quarto() {
		
	}
	public Quarto(String nome, int numeroCamas) {
		super();
		this.numeroCamas=numeroCamas;
	}
	
	//getters e setters
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas=numeroCamas;
	}
}

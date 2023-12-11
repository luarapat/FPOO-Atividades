package Atividade_Luara_Patracon;

public class Sala extends Comodo{
	//atributos
	private boolean temTV;
	
	//construtores
	public Sala() {
		
	}
	public Sala( String nome, int numeroCamas, boolean temTV) {
		super();
		this.temTV = temTV;
	}
	
	//getters e setters
	public boolean getTemTV() {
		return temTV;
	}
	public void setTemTV(boolean temTV) {
		this.temTV=temTV;
	} 
	public void temTV() {
		if (temTV= true) {
			System.out.println("tem tv");
		}else  {
			System.out.println("nao tem tv");
		}
	}
	
}



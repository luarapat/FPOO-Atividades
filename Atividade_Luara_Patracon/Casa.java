package Atividade_Luara_Patracon;

public class Casa {
	//atributos
	private String cor;
	private float preco;
	private float metragem;
	private Quarto quarto;
	private Sala sala;
	
	//construtores
	public Casa() {
		
	}
	public Casa(String nome, int numeroCamas, boolean temTV, String cor, float preco
			, float metragem, Quarto quarto, Sala sala) {
		this.cor=cor;
		this.metragem=metragem;
		this.preco=preco;
		this.quarto=quarto;
		this.sala=sala;
	}
	
	//getters e setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setpreco(float preco) {
		this.preco=preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem=metragem;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto( Quarto quarto) {
		this.quarto=quarto;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala( Sala sala) {
		this.sala=sala;
	}
	//método
	public void mostrarDetalhes() {
		System.out.println("Anotado! Então sua casa tem a cor  " + getCor() + ", custa " + getPreco()+
				" e tem a metragem de " + getMetragem());
		
	}

	
}

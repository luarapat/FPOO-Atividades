package Atividade_Luara_Patracon;

public class VasoDecorado extends Vaso {//heranca
	//atributos
	private String decoracao;
	public VasoDecorado (String decoracao) {
		super();
		this.decoracao= decoracao;
	}
	public VasoDecorado() {
	}
			//getters e setters  return type
			public String getDecoracao() {
				return decoracao;
			}
			public void setDecoracao(String decoracao) {
				this.decoracao = decoracao;
			}
	public void exibir() {
	System.out.println("o vaso é composto pela decoracao de " + decoracao);
}
}

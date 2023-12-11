package Atividade_Luara_Patracon;

public class Vaso {
	//atributos
		private String cor;
		private double tamanho;
		private String material ;
		
	//construtor
		public Vaso() {
			super();
			System.out.println("o vaso acabou de ser fabricado");
		}
	//getters e setters  return type
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public double getTamanho() {
			return tamanho;
		}
		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public void exibir() {
			System.out.println("o vaso na cor" + cor + "do tamanho" + tamanho + "feito com" + material
					+ "está a venda e em exposição na galeria das belas artes");
		}
		
}

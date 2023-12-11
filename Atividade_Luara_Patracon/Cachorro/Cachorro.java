package Cachorro;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	//métodos 
	public void latir() {
		System.out.println(" ele está latindo!");
	}
	public void comer() {
		System.out.println("ele esta comendo!");
	}
	public void dormir() {
		System.out.println(" ele esta dormindo!");
	}
	public void brincar() {
		System.out.println(" ele esta brincando!");
	}
}

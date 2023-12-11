package Astronomia;

public class Pessoa {
	//atributos
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	//construtores
	public Pessoa() {
	}
	public Pessoa(String nome, String sobrenome, String cpf, int idade) {
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
}

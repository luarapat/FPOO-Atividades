package Atividade_Luara_Patracon;

public class Pessoa {
	//Atributos
	protected String nome;
	protected String endereço;
	protected int telefone;
	protected int cpf;
	protected int celular;
	
	//construtor
		public Pessoa() {
			System.out.println("comecando atividade 3");
		}
		public void metodoImprimir() {
			System.out.println("imprimi na pessoa");
		}
		
	//parametros
	public Pessoa(String nome, String endereco, int telefone, int cpf, int celular ) {
	       this.nome = nome;
	       this.endereço = endereco;
	       this.telefone = telefone;
	       this.cpf = cpf;
	       this.celular = celular;
	}
		
		
		
	//Getters setters
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereço (String endereço) {
		this.endereço = endereço;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setTelefone (int telefone) {
		this.telefone = telefone;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setCpf (int cpf) {
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCelular (int celular) {
		this.celular = celular;
	}
	public int getCelular() {
		return celular;
	}
}

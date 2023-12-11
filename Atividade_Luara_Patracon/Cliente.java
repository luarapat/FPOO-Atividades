package Atividade_Luara_Patracon;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String email;
	
	//construtores 
	public Cliente() {
		
	}
	public Cliente(String nome, String sobrenome, String email) {
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.email=email;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome=sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}

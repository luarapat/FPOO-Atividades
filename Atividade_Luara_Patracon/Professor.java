package Atividade_Luara_Patracon;

public class Professor extends Pessoa{
	//atributos 
	private String nomeCurso;
	private float salario;
	
	
	//construtor
	public Professor() {
		System.out.println("sou um professor");
	}
	
	//parametros
	public Professor (String nome, String endereco, int telefone, int cpf, int celular,String nomeCurso,float salario){
		super.nome = nome;
		super.endereço = endereco;
		super.telefone = telefone;
		super.cpf = cpf;
		super.celular = celular;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}
	
	//getts e setters
	public void setNomeCurso (String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSalario() {
		return salario;
	}
}

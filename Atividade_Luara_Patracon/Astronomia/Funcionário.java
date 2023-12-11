package Astronomia;

public class Funcionário extends Pessoa implements Nasa {
	//atributos
	private String registro;
	private double salário;
	//construtores
	public Funcionário() {
	}
	public Funcionário(String nome, String sobrenome, String cpf, int idade, String registro, double salário) {
		super();
		this.registro = registro;
		this.salário = salário;
	}
	//getters e setters
	public String getRegistro() {
		return registro;
	}
	public void setRegistro (String registro) {
		this.registro = registro;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário (double salário) {
		this.salário = salário;
	}
	//métodos
	public void estudar() {
		System.out.println("O funcionário está estudando...");
	}
	@Override
	public void pesquisar() {
		System.out.println("Pesquisando objeto...");
		
	}
	@Override
	public void lancarObjeto() {
		System.out.println("Lançando objeto");
		
	}
}

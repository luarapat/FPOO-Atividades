package Astronomia;

public class Maquina1 implements Sistema{
	//atributos
	private String funcao;
	//construtores
	public Maquina1 () {
	}
	public Maquina1(String funcao) {
		this.funcao = funcao;
	}
	//getters e setters
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao (String funcao) {
		this.funcao = funcao;
	}
	//métodos
	public void trabalhar() {
		System.out.println("A máquina um está ligando..., máquina dois acionada");
	}
	
	@Override
	public void exibirDados() {
		System.out.println("exibindo dados");
		
	}
	@Override
	public void coletarDados() {
		System.out.println("coletando dados...");
		
	}
}

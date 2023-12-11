package Atividade_Luara_Patracon;

public class Passagem {
	//atributos
	private Voo voo;
	private Cliente cliente;
	private double precoTotal;
	
	//construtores
	
	public Passagem(Voo voo, Cliente cliente, double precoTotal) {
		this.voo=voo;
		this.cliente=cliente;
		this.precoTotal=precoTotal;
	}
	public Passagem(Voo voo, Cliente cliente) {
		this.voo=voo;
		this.cliente=cliente;
	}
	
	//getters e setters
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo=voo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente=cliente;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal=precoTotal;
	}
	//métodos
	@Override
	public String toString() {
		return "nome: " + this.cliente.getNome() + " com o numero do voo "+
	voo.getNumeroVoo() +" de origem " + voo.getOrigem() + " indo para " +
				voo.getDestino() + " pagou em sua passagem " + voo.getPreco();
		
	}
}

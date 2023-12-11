package Atividade_Luara_Patracon;

public class MountainBike implements Veículo {
	//atributos
	private int velocidade;
	private int marcha;
	
	//construtor padrão
	public MountainBike() {
			
	}
	//construtor c/ parametros
	public MountainBike(int velocidade, int marcha) {
	this.marcha=marcha;
	this.velocidade = velocidade;
		}
	
	//getters e setters
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	//método
	public void estado() {
	}
	@Override
	public String mudarMarcha() {
		return null;
		
	}
	@Override
	public void acelerar(int vel) {
		velocidade = vel + 10;
	}
	@Override
	public void frear(int vel) {
		velocidade = -10;
	}
}

package Bike;

public class SpeedBike  implements Veículo{
	//atributos
	private int velocidade;
	private int marcha;
	
	//construtor padrão
	public SpeedBike() {
		
	}
	//construtor c/ parametros
	public SpeedBike(int velocidade, int marcha) {
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
	
	//métodos
	
	public void estado() {
		
	}
	@Override
	public String mudarMarcha() {
		int mar;
		marcha = mar;
		
	}
	@Override
	public void acelerar(int vel) {
		velocidade = velocidade + 10;
	}
	@Override
	public void frear(int vel) {
		velocidade = 0;
	}
	
		

}

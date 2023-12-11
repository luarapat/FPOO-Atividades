package Astronomia;

public class Maquina2 {
	//atributos
	private String sensor;
	private String camera;
	//construtores
	public Maquina2() {
	}
	public Maquina2(String sensor, String camera) {
		this.camera = camera;
		this.sensor = sensor;
	}
	//getters e setters
	public String getSensor() {
		return sensor;
	}
	public void setSensor (String sensor) {
		this.sensor = sensor;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera (String camera) {
		this.camera = camera;
	}
	//métodos
	public void analisar() {
		System.out.println("analisando objeto...");
	}
	public void especionar() {
		System.out.println("examinando objeto...");
	}
}

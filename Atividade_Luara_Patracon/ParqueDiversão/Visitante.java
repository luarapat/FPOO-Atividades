package ParqueDiversão;

public class Visitante {
	public static String nome;
    private int idade;
    private double alt;

    // Construtor com parâmetros
    public Visitante(int idade, double alt, String nome) {
        Visitante.nome = nome;
        this.idade = idade;
        this.alt = alt;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public boolean requisitos;
    public double altMin;
    public void podeAndar() {
    	if (idade < 16 || alt < altMin ) {
    		requisitos = true;
    	}
    	else {
    		requisitos = false;
    	}
    	}

	public void altMin(String next) {
		
		
	}
}
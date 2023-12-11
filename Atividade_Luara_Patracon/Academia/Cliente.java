package Academia;

public class Cliente {

	    public String nome;
	    public float alt, peso, pesodesejado;
	    int CPF;
		public int idade,telefone;
	    public float imc = peso / (alt * alt);
		public String Nome;
		public int Tel;
		public int Idade;
		public double Alt;
		public double Peso;

	    
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String n) {
	        nome = n;
	    }

	    public float getAlt() {
	        return alt;
	    }

	    public void setAlt(float A) {
	    alt = A;
	        }

	    public float getPeso() {
	        return peso;
	    }

	    public void setPeso(float P) {
	    peso = P;
	    }

	    public int getCPF() {
	        return CPF;
	    }

	    public void setCPF(int C) {
	     CPF = C;
	    }

	    public int getIdade() {

	        return idade;

	    }

	    public void setIdade(int I) {
	     idade = I;
	    }

	    public int getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(int T) {
	     telefone = T;

	    }
	    public float getCalcularIMC() {
	    	imc = peso/(alt*alt);
	    	return imc;
	    }
	    public float getCalcularPesoDesejado(){
	        float meta = peso - pesodesejado;
	        return meta;
	    }
	    public String getImprimirDados() {
	    	String dados = "Seja bem vindo";
	    	System.out.println("Nome" + nome);
	    	System.out.println("CPF" + CPF);
	    	System.out.println("alt" + alt);
	    	System.out.println("peso" + peso);
	    	System.out.println("idade" + idade);
	    	System.out.println("telefone" + telefone);
	    	System.out.println("imc" + imc);
	    	
	    	if (imc <= 18.5) {
		        System.out.println("Sua Classificação é de Magreza");

		    } else if (imc <= 18.5 || imc <= 25) {
		        System.out.println("Sua Classificação Está Dentro do Normal");

		    } if (imc >= 25 || imc <= 30) {
		        System.out.println("Sua Classificação é de Sobrepeso");
		    }
		

	    	System.out.println("meta" + getCalcularPesoDesejado());
	    	
	    	return dados;

	    }

		public String calcularPesoDesejado(int i) {
			// TODO Auto-generated method stub
			return null;
		}
}





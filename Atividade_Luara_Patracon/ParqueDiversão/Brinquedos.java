package ParqueDiversão;

	public class Brinquedos {
		
		//atributos
	    public String nome;
	    private int idadeMin;
	    private double alt;
	    private int vagsDisponiveis;

	    // padrão
	    public void Brinquedo() {
	        this.idadeMin = 12;
	        this.alt = 140.0;
	        this.vagsDisponiveis = 40;
}
	    //parametros
	    public void Brinquedo(int idadeMin, double alt, int vagsDisponiveis) {
	        this.idadeMin = idadeMin;
	        this.alt = alt;
	        this.vagsDisponiveis = vagsDisponiveis;
}
	    //uhid
	    public int getIdadeMinima() {
	        return idadeMin;
}

	    public void setIdadeMinima(int idadeMin) {
	        this.idadeMin = idadeMin;
}

	    public double getAlt() {
	        return alt;
}

	    public void setAlturaMinima(double alt) {
	        this.alt = alt;
}

	    public int getVagsDisponiveis() {
	        return vagsDisponiveis;
}

	    public void setVagsDisponiveis(int vagsDisponiveis) {
	        this.vagsDisponiveis = vagsDisponiveis;
}

	   

	 

	    // Informações
	    public  void exibirInformacoes() {
	        System.out.println("Idade mínima: " + idadeMin + " anos");
	        System.out.println("Altura mínima: " + alt + "m");
	        System.out.println("Vagas disponíveis: " + vagsDisponiveis);
	        
	    }
		public void setNome(String next) {
			// TODO Auto-generated method stub
			
		}
		public void setAlt(int nextInt) {
			// TODO Auto-generated method stub
			
		}
	    

	    }
		    

	   
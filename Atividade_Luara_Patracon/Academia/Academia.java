package Academia;
public class Academia {
	public String Nome, CPF;

    public double Alt,Peso;
    public int Idade;
    public int Tel;
    public double calcularIMC() {
    double imc = Peso / (Alt * Alt);
    return imc;
    }

    public double calcularPesoDesejado(double metaPeso){
        if(Peso  >  metaPeso) {
        return Peso = metaPeso;
    }else {
        return metaPeso = Peso;
        }

    }

        public void imprimirDados() {
            System.out.println("CPF:" + CPF + "Nome:" + Nome + "Tel:" + Tel + "Idade:" + Idade + "Alt:" + Alt +
                    "m" + "Peso:" + Peso + "kg");

    }

}    

        
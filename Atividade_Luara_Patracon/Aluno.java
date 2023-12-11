package Atividade_Luara_Patracon;



public class Aluno  extends Pessoa{
	//atributos
	private String curso;
	private float nota;

	
	
	//construtor
			public Aluno() {
				System.out.println("sou um aluno");
			}
			
	//parametreos 
	public Aluno (String nome, String endereco, int telefone, int cpf, int celular,String curso,float nota){
		super.nome = nome;
		super.endereço = endereco;
		super.telefone = telefone;
		super.cpf = cpf;
		super.celular = celular;
		this.curso = curso;
		this.nota = nota;
		
		
	}
			
	//getters e setters 
	public void setCurso (String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota() {
		return nota;
	}
	
	// metodo calcular media 
	public float media;
	public int nota1;
	public int nota2;
	public void calcularMedia() {
		media = (nota1 + nota2)/2;
		
	}
	public void setNota1(int nextInt) {
	}
	public void setNota2(int nextInt) {
	}
	public void calcularmedia() {
	}
	//mostrar a nota do aluno
	public void situacaoAluno() {
		if (media >= 6) {
			System.out.println("voce passou");
		} else {
			System.out.println("voce reprovou");
		}
	}
	}
	


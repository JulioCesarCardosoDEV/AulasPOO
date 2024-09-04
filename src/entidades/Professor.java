package entidades;

public class Professor extends Funcionario{
	private String titulacao;
	
	public Professor(){
		
	}
	
	public Professor(String titulacao){
		this.titulacao = titulacao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public void digitarNotas(int turma){
		
	}
}

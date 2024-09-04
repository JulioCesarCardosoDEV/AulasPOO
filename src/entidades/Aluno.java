package entidades;

public class Aluno extends Usuario{
	private int matricula;
	private String curso;
	
	public Aluno(){
		
	}
	
	public Aluno(String login, String senha) {
		super(login, senha);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void matricularse(int matricula, String curso){
		this.matricula = matricula; 
		this.curso = curso;
	}
	
	public void trancarMatricula(){
		setMatricula(0);
	}
}

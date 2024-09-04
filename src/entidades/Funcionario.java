package entidades;

public class Funcionario extends Usuario{
	private int numFuncional;
	
	public Funcionario(){
		
	}

	public Funcionario(int numFuncional) {
		this.numFuncional = numFuncional;
	}

	public int getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(int numFuncional) {
		this.numFuncional = numFuncional;
	}
	
	public void registrarHora(java.util.Date data){
		
	}
}

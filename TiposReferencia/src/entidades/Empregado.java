package entidades;

public class Empregado {
	private String nome;
	private double salario;
	private Empresa empresa;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void getEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}

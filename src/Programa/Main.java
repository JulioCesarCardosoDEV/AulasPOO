package Programa;

import entidades.Funcionario;
import entidades.Professor;
import entidades.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("123", "123");
		
		System.out.println(usuario.logar("122", "123"));
		
		Funcionario funcionario = new Funcionario(20);
		
		Professor professor = new Professor("carlos");
		
	}

}

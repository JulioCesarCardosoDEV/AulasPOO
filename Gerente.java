public class Gerente extends Funcionario implements Autenticavel{
    private String senha;

    public Gerente(){

    }

    public Gerente(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}

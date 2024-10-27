public class Diretor extends Funcionario implements Autenticavel{
    private String senha;

    public Diretor() {
    }

    public Diretor(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}

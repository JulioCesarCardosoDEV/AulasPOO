public class Cliente implements Autenticavel{
    private String nome;
    private String senha;

    public Cliente(){

    }

    public Cliente(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}

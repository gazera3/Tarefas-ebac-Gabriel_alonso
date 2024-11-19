public class Conta {
    private String nome;
    private String email;
    private String senha;

    public Conta(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email;
    }
}

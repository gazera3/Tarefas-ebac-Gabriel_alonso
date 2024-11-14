public class Pessoa {
    String nome;
    String genero;

    // Construtor para inicializar a pessoa com nome e gênero
    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Gênero: " + genero);
    }
}

abstract class Pessoa {
    String nome;
    String endereco;

    // Construtor da classe abstrata para inicializar nome e endereço
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método abstrato para exibir as informações da pessoa, a ser implementado nas subclasses
    public abstract void exibirInformacoes();
}
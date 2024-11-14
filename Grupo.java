public class Grupo {
    Pessoa[] pessoas; // Array para armazenar pessoas
    int indice = 0;   // Índice para controlar a posição de inserção

    // Construtor para inicializar o array de pessoas com um tamanho fixo
    public Grupo(int tamanho) {
        pessoas = new Pessoa[tamanho];
    }

    // Método para adicionar uma pessoa ao grupo
    public void adicionarPessoa(Pessoa pessoa) {
        if (indice < pessoas.length) {
            pessoas[indice] = pessoa;
            indice++;
        }
    }

    // Método para exibir todas as pessoas no grupo
    public void exibirPessoas(String descricaoGrupo) {
        System.out.println("Grupo de " + descricaoGrupo + ":");
        for (int i = 0; i < indice; i++) {
            pessoas[i].exibirInformacoes();
        }
    }
}

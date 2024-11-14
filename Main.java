public class Main {
    public static void main(String[] args) {
        // Criando alguns objetos Pessoa
        Pessoa p1 = new Pessoa("João", "Masculino");
        Pessoa p2 = new Pessoa("Maria", "Feminino");
        Pessoa p3 = new Pessoa("Pedro", "Masculino");
        Pessoa p4 = new Pessoa("Ana", "Feminino");

        // Criando grupos para homens e mulheres com capacidade de 10 pessoas
        Grupo grupoHomens = new Grupo(10);
        Grupo grupoMulheres = new Grupo(10);

        // Array de pessoas para separar por gênero
        Pessoa[] pessoas = { p1, p2, p3, p4 };
        for (Pessoa pessoa : pessoas) {
            if (pessoa.genero.equalsIgnoreCase("Masculino")) {
                grupoHomens.adicionarPessoa(pessoa);
            } else if (pessoa.genero.equalsIgnoreCase("Feminino")) {
                grupoMulheres.adicionarPessoa(pessoa);
            }
        }

        // Exibindo os grupos separados por gênero
        grupoHomens.exibirPessoas("Homens");
        grupoMulheres.exibirPessoas("Mulheres");
    }
}

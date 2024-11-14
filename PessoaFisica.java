public class PessoaFisica extends Pessoa {
    String cpf;

    // Construtor para inicializar nome, endereço e CPF
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco); // Chama o construtor da classe abstrata
        this.cpf = cpf;
    }

    // Implementação do método exibirInformacoes, específico para Pessoa Física
    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
    }
}

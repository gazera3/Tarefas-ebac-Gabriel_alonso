public class PessoaJuridica extends Pessoa {
    String cnpj;

    // Construtor para inicializar nome, endereço e CNPJ
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco); // Chama o construtor da classe abstrata
        this.cnpj = cnpj;
    }

    // Implementação do método exibirInformacoes, específico para Pessoa Jurídica
    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
    }
}

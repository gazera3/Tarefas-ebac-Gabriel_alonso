public class Main {
    public static void main(String[] args) {
        // Criando instâncias de PessoaFisica e PessoaJuridica
        Pessoa pessoaFisica = new PessoaFisica("João da Silva", "Rua das Flores, 123", "123.456.789-00");
        Pessoa pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Avenida Central, 456", "12.345.678/0001-00");

        // Exibindo as informações de cada pessoa chamando o método exibirInformacoes
        pessoaFisica.exibirInformacoes();
        pessoaJuridica.exibirInformacoes();
    }
}

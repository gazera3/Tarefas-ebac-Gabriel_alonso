public class Carro {
    // Propriedades do carro
    String marca;
    String modelo;
    int ano;
    String cor;

    // Construtor para inicializar o carro
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Branco");
        
        // Exibindo as informações do carro
        meuCarro.exibirInformacoes();
    }
}

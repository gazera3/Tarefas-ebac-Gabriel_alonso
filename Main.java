import veiculos.Carro;
import veiculos.ListaVeiculos;

public class Main {
    public static void main(String[] args) {
        // Criação de uma lista de carros
        ListaVeiculos<Carro> listaCarros = new ListaVeiculos<>();

        // Adicionando carros à lista
        listaCarros.adicionarVeiculo(new Carro("Honda", "Civic", 2020));
        listaCarros.adicionarVeiculo(new Carro("Toyota", "Corolla", 2021));
        listaCarros.adicionarVeiculo(new Carro("Ford", "Focus", 2018));

        // Listando todos os carros
        System.out.println("Lista de carros:");
        listaCarros.listarVeiculos();
    }
}

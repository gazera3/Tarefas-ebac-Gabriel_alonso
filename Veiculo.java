package veiculos;

import annotations.Tabela;

@Tabela(nome = "veiculos") // Opcional: Pode ser usada para mapear a classe base a uma tabela
public abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
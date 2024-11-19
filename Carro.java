package veiculos;

import annotations.Tabela;

@Tabela(nome = "carros") // Mapear para a tabela "carros"
public class Carro extends Veiculo {
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + ano + ")";
    }
}
package veiculos;

import java.util.ArrayList;
import java.util.List;

public class ListaVeiculos<T extends Veiculo> {
    private List<T> lista;

    public ListaVeiculos() {
        this.lista = new ArrayList<>();
    }

    public void adicionarVeiculo(T veiculo) {
        lista.add(veiculo);
    }

    public List<T> getTodos() {
        return lista;
    }

    public void listarVeiculos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum veículo na lista.");
        } else {
            for (T veiculo : lista) {
                System.out.println(veiculo);
            }
        }
    }
}

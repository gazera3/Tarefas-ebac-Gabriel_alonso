public class ClienteDao implements IClienteDao {

    @Override
    public void buscar(String id) {
        System.out.println("Buscando cliente com ID: " + id);
    }

    @Override
    public void excluir(String id) {
        System.out.println("Excluindo cliente com ID: " + id);
    }

    @Override
    public void atualizar(String id, String novoDado) {
        System.out.println("Atualizando cliente com ID: " + id + " para o novo dado: " + novoDado);
    }
}
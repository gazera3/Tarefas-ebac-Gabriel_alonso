public class ClienteDaoMock implements IClienteDao {

    @Override
    public void buscar(String id) {
        System.out.println("Mock: Buscando cliente com ID: " + id);
    }

    @Override
    public void excluir(String id) {
        System.out.println("Mock: Excluindo cliente com ID: " + id);
    }

    @Override
    public void atualizar(String id, String novoDado) {
        System.out.println("Mock: Atualizando cliente com ID: " + id + " para o novo dado: " + novoDado);
    }
}
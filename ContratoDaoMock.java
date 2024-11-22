public class ContratoDaoMock implements IContratoDao {

    @Override
    public void buscar(String id) {
        System.out.println("Mock: Buscando contrato com ID: " + id);
    }

    @Override
    public void excluir(String id) {
        System.out.println("Mock: Excluindo contrato com ID: " + id);
    }

    @Override
    public void atualizar(String id, String novoDado) {
        System.out.println("Mock: Atualizando contrato com ID: " + id + " para o novo dado: " + novoDado);
    }
}
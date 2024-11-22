public class ContratoDao implements IContratoDao {

    @Override
    public void buscar(String id) {
        System.out.println("Buscando contrato com ID: " + id);
    }

    @Override
    public void excluir(String id) {
        System.out.println("Excluindo contrato com ID: " + id);
    }

    @Override
    public void atualizar(String id, String novoDado) {
        System.out.println("Atualizando contrato com ID: " + id + " para o novo dado: " + novoDado);
    }
}
public interface IContratoDao {
    void buscar(String id);
    void excluir(String id);
    void atualizar(String id, String novoDado);
}

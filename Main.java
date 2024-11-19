import annotations.Tabela;
import veiculos.Carro;
import veiculos.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Classes a serem verificadas
        Class<?>[] classes = {Carro.class, Veiculo.class};

        for (Class<?> clazz : classes) {
            // Verificar se a classe possui a annotation @Tabela
            if (clazz.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = clazz.getAnnotation(Tabela.class);
                System.out.println("A classe " + clazz.getSimpleName() + " está mapeada para a tabela: " + tabela.nome());
            } else {
                System.out.println("A classe " + clazz.getSimpleName() + " não possui a annotation @Tabela.");
            }
        }
    }
}

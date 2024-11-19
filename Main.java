import annotations.Tabela;
import veiculos.Carro;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // Verificar se a classe Carro possui a annotation @Tabela
        Class<Carro> carroClass = Carro.class;

        if (carroClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = carroClass.getAnnotation(Tabela.class);
            System.out.println("A classe " + carroClass.getSimpleName() + " está mapeada para a tabela: " + tabela.nome());
        } else {
            System.out.println("A classe " + carroClass.getSimpleName() + " não possui a annotation @Tabela.");
        }
    }
}

package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
    @Test
    public void testSomenteNomesFemininos() {
        // Configurar os dados
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Pedro", "Masculino"));
        pessoas.add(new Pessoa("Clara", "Feminino"));

        // Filtrar apenas mulheres
        List<Pessoa> mulheres = pessoas.stream()
                                       .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                                       .collect(Collectors.toList());

        // Verificar se a lista resultante contém apenas nomes femininos
        assertTrue(mulheres.stream().allMatch(p -> p.getGenero().equalsIgnoreCase("Feminino")),
                "A lista contém apenas pessoas do gênero Feminino.");
    }
}

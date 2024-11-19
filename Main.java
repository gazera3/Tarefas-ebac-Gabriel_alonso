import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Pedro", "Masculino"));
        pessoas.add(new Pessoa("Clara", "Feminino"));

        // Filtrar apenas mulheres usando Streams e Lambdas
        List<Pessoa> mulheres = pessoas.stream()
                                       .filter(p -> p.getGenero().equalsIgnoreCase("Feminino"))
                                       .collect(Collectors.toList());

        // Exibir a lista de mulheres
        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
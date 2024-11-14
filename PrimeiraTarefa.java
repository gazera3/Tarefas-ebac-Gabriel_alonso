public class PrimeiraTarefa {
    // Definindo a lista de nomes como um campo estático
    public static String[] nomes = {
        "Ana - Feminino",
        "Carlos - Masculino",
        "Bianca - Feminino",
        "Pedro - Masculino",
        "Carla - Feminino",
        "Lucas - Masculino",
        "Paula - Feminino"
    };

    public static void main(String[] args) {
        // Exibindo a lista de nomes
        System.out.println("Lista de Nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

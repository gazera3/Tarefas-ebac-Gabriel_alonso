public class SegundaTarefa {
    public static void main(String[] args) {
        // Acessando a lista de nomes da PrimeiraTarefa
        String[] nomes = PrimeiraTarefa.nomes;

        // Contando quantos nomes femininos e masculinos existem
        int countFeminino = 0;
        int countMasculino = 0;

        for (String nome : nomes) {
            if (nome.contains("Feminino")) {
                countFeminino++;
            } else if (nome.contains("Masculino")) {
                countMasculino++;
            }
        }

        // Criando arrays separados para cada gênero
        String[] nomesFemininos = new String[countFeminino];
        String[] nomesMasculinos = new String[countMasculino];

        // Preenchendo os arrays de acordo com o gênero
        int indexFeminino = 0;
        int indexMasculino = 0;

        for (String nome : nomes) {
            if (nome.contains("Feminino")) {
                nomesFemininos[indexFeminino++] = nome;
            } else if (nome.contains("Masculino")) {
                nomesMasculinos[indexMasculino++] = nome;
            }
        }

        // Exibindo a lista ordenada por gênero
        System.out.println("Lista de Nomes Ordenada por Gênero:");
        
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }
    }
}

public class Aluno {
    // Propriedades do aluno
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    // Construtor para inicializar as informações do aluno
    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // Método para exibir as informações do aluno, a média e o status
    public void exibirInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        
        double media = calcularMedia();
        System.out.println("Média Final: " + media);
        
        // Condição para verificar o status do aluno com base na média
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        // Criando um objeto Aluno com suas notas
        Aluno aluno = new Aluno("João", 0, 10, 0, 0);
        
        // Exibindo as informações, a média e o status do aluno
        aluno.exibirInformacoes();
    }
}

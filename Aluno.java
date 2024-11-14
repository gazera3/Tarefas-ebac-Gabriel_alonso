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

    // Método para exibir as informações do aluno e a média
    public void exibirInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Média Final: " + calcularMedia());
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        // Criando um objeto Aluno com suas notas
        Aluno aluno = new Aluno("João", 8.5, 7.0, 9.2, 6.8);
        
        // Exibindo as informações e a média do aluno
        aluno.exibirInformacoes();
    }
}

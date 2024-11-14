public class Main {
    public static void main(String[] args) {
        // Lê uma linha de entrada do console e armazena como String
        String input = System.console().readLine("Digite um valor inteiro: ");
        
        // Converte a String para um valor inteiro primitivo
        int valorPrimitivo = Integer.parseInt(input);
        
        // Converte o valor primitivo para o tipo wrapper Integer
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);
        
        // Imprime o valor wrapper no console
        System.out.println("Valor como tipo wrapper: " + valorWrapper);
    }
}

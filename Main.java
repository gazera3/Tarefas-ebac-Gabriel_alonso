import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        RegistroDeContas registro = new RegistroDeContas();

        while (true) {
            String[] opcoes = { "Registrar Conta", "Listar Contas", "Sair" };
            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu de Registro de Contas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            if (escolha == 0) {
                registro.registrarConta();
            } else if (escolha == 1) {
                registro.listarContas();
            } else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "Saindo do programa. Até mais!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}

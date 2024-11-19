import javax.swing.JOptionPane;

public class RegistroDeContas {
    private Conta[] contas = new Conta[100];
    private int contador = 0;

    public void registrarConta() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");
        String confirmarSenha = JOptionPane.showInputDialog("Confirme sua senha:");

        if (!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem! Registro cancelado.");
            return;
        }

        contas[contador] = new Conta(nome, email, senha);
        contador++;
        JOptionPane.showMessageDialog(null, "Conta registrada com sucesso!");
    }

    public void listarContas() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma conta registrada.");
            return;
        }

        StringBuilder lista = new StringBuilder("Contas Registradas:\n");
        for (int i = 0; i < contador; i++) {
            lista.append(contas[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }
}

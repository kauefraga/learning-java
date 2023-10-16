import javax.swing.JOptionPane;

public class IntroducaoGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(
            null,
            "Oie, " + name
        );

        int age = Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade")
        );

        JOptionPane.showMessageDialog(
            null,
            "Você tem " + age + " anos de idade!"
        );
    }
}

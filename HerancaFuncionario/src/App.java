import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario standartFunc = new Funcionario("João", 1200);
        Gerente funcGerente = new Gerente("Pedro", 6000.00, "Rose");

        standartFunc.moreSalary(50);
        funcGerente.moreSalary(50);

        JOptionPane.showMessageDialog(null, standartFunc.Print(), "INFO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, funcGerente.Print(), "INFO", JOptionPane.INFORMATION_MESSAGE);
    }
}

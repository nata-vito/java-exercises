import  javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome, num;
        int n, idade;
        // Janela de visualização
        //JOptionPane.showMessageDialog(null, "Hello World", "Miha primeira Janela", JOptionPane.WARNING_MESSAGE);

        //Janela com entrada
        nome =  JOptionPane.showInputDialog("Digite sua nome: ");
        System.out.println("Nome: " + nome);

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        System.out.println("Idade: " + idade);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        System.out.println("Peso: " + peso);
    }
}   

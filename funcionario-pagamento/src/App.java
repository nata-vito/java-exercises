import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("Jose", "123", 1000); 
		System.out.println(f.Print()); 

		System.out.println("Imposto:" + f.calcularImposto());
		System.out.println("Salario Liquido:" + f.calcularSalLiq(f.calcularImposto()));
		
		System.out.println("-----------------");

		Gerente g = new Gerente("Maria", "456", 10000, "financas");
		g.imprimir();

		System.out.println("Imposto:" + g.calcularImposto());
		System.out.println("Salario Liquido:" + g.calcularSalLiq(g.calcularImposto()));
		
		System.out.println("-----------------");

		Vendedor v = new Vendedor("Carlos", "789", 5000, 10);
		v.imprimir();

		System.out.println("Imposto:" + v.calcularImposto());
		System.out.println("Salario Liquido:" + v.calcularSalLiq(v.calcularImposto()));

        Gerenciar gerenciar = new Gerenciar();
        gerenciar.Add(f);
        gerenciar.Add(g);
        gerenciar.Add(v);

        System.out.println(gerenciar.Print());

        int op;
        while(true){

            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar\n2 - Buscar Funcionario\n" +
                                                            "3 - Listar Todos\n4 - Sair\nOpção desejada"));

            switch(op){
                case 1:{
                    System.out.println("Cadastrar   ");
                    break;
                }
                case 2:{
                    System.out.println("Buscar   ");
                    break;
                }
                case 3:{
                    System.out.println("Listar todos   ");
                    break;
                }
                case 4:{
                    System.out.println("Sair");
                    break;
                }
                default:{
                    System.out.println("Opcao invalida!");
                    break;
                }
            }

        }
    }
}

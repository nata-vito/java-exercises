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
    }
}

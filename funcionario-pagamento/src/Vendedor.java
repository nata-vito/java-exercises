public class Vendedor extends Funcionario {
	private double comissao; 
	
	public Vendedor(String nome, String cpf, double salario, double comissao) {
		super(nome, cpf, salario); 
		this.comissao = comissao; 
	}
	
	public double calcularSalLiq(double desconto) {
		return getSalario() + (getSalario()*comissao/100.0) - desconto; 
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimir() {
		super.Print();
		System.out.println("Comissao: " + comissao);
	}
}

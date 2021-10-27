
public class Gerente extends Funcionario {
    private String area; 
    
    public Gerente(String nome, String cpf, double salario, String area) {
        super(nome, cpf, salario); 
        this.area = area;
    }
    
    public double calcularImposto() {
        return getSalario() * 20/100.0; 
    }
   
    public void imprimir() {
        super.Print();
        System.out.println("Area:" + area);
    }

   public String getArea() {
       return area;
   }

   public void setArea(String area) {
       this.area = area;
   }

}

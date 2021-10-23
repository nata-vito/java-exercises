public class Gerente extends Funcionario {
    private String secretaryName;

    public Gerente(String name, Double salary, String secretaryName){
        // Necessaria para puxar os atributos de herança da super classe
        //super(name, salary);   // redundante se existe o construtor padrão na super classe          
        this.setSecretaryName(secretaryName);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }

    public void moreSalary(double percent) {
        double salary;
        
        // Usando metodo da super classe
        super.moreSalary(percent);
        salary = this.getSalary() + (this.getSalary() * 0.2);

        this.setSalary(salary);
    }

    public String Print() {
        String data = "";
        data = super.Print();

        return data + "\nSecretary Name: " + this.getSecretaryName();
    }
}

/* 
    Implemente novas funcionalidades para a Classe Aluno definida no exemplo:
    Calcular o IMC peso/(altura*altura)Mostrar a Situação do aluno
 */
import java.text.DecimalFormat;

public class classeAluno {
    private String nome, sexo;
    private double altura, peso;
    private int anoNascimento, anoAtual, idade;

    // método acessor para setar valor de idade
    public void setIdade(int old) {
        this.idade = old;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAnoNascimento(int ano) {
        this.anoNascimento = ano;
    }

    public void setAnoAtual(int ano) {
        this.anoAtual = ano;
    }

    public void setPeso(int weight) {
        this.peso = weight;
    }
    
    public void Idade() {
        int anos = anoAtual-anoNascimento;
        this.idade = anos;
    }

    public double PesoIdeal() {
        double pesoIdeal;

        if(sexo.toLowerCase().equals("f")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else{
            pesoIdeal = (72.7 * altura) - 58;
        }
        return pesoIdeal;
    }

    public String calculateIMC() {
        double imc;
        String value;

        imc = peso/(altura*altura);
        value = Situation(imc);

        return value;
    }

    public String Situation(double imc) {
        String situation = "";

        if(imc < 18.5){
            situation = "Abaixo do peso ideal";
        }
        if((imc >= 18.5) && (imc <= 24.9) ){
            situation = "Peso normal";
        }
        if((imc >= 25.0) && (imc <= 29.9) ){
            situation = "Acima do peso (sobrepeso)";
        }
        if((imc >= 30.0) && (imc <= 34.9) ){
            situation = "Obesidade grau I";
        }
        if((imc >= 35.0) && (imc <= 39.9) ){
            situation = "Obesidade grau II";
        }
        if(imc >= 40.0){
            situation = "Obesidade grau III";
        }

        return situation;
    }

    public String getName() {
        return nome;
    }

    public void Imprimir() {
        DecimalFormat df = new DecimalFormat("0.00");           //Formatação para números decimais

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + df.format(peso) + "\nPeso Ideal: " + df.format(PesoIdeal()));
        System.out.println("Altura: " + altura);
        System.out.println("Situação IMC: " + calculateIMC());

        System.out.println("Ano de Nascimento: " + anoNascimento);

    }
}

public class Apolice {
    // Encapsulamento
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    // Construtor padrão
    public Apolice(){
        setNomeSegurado(null);
        setIdade(0);
        setValorPremio(0);
    }

    // Construtor com a entrada dos parêmetros
    public Apolice(String nomeSegurado, int idade, double valorPremio) {
        setNomeSegurado(nomeSegurado);
        setIdade(idade);
        setValorPremio(valorPremio);
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    // Cálculo do valor liquido do prêmio da apolice 
    public void premioApolice() {
        double valor = 0;

        // Desconto para maiores de 18 até 25 anos
        if((getIdade() >= 18) && (getIdade() <= 25)){                           
            valor = getValorPremio() + (getValorPremio() * 0.2);
        }
        // Desconto para maiores de 25 até 36 anos
        else if((getIdade() > 25) && (getIdade() <= 36)){                       
            valor = getValorPremio() + (getValorPremio() * 0.15);
        }
        // Desconto para maiores de 36 anos
        else if(getIdade() > 36){                                              
            valor = getValorPremio() + (getValorPremio() * 0.10);
        }
        else{
            System.out.println("É menor de idade!");
        }
        
        setValorPremio(valor);
    }

    // Cáculo do desconto em relação a cidade
    public void descontoApolice(String cidade) {
        double desconto = 0;

        // Curitiba
        if(cidade.toLowerCase().equals("curitiba")){                                    
            desconto = getValorPremio() - (getValorPremio() * 0.2);
        }
        // Rio de Janeiro
        else if(cidade.toLowerCase().equals("rio de janeiro")){                         
            desconto = getValorPremio() - (getValorPremio() * 0.15);
        }
        // São Paulo
        else if(cidade.toLowerCase().equals("são paulo")){                              
            desconto = getValorPremio() - (getValorPremio() * 0.10);
        }
        // Belo Horizonte
        else if(cidade.toLowerCase().equals("belo horizonte")){                         
            desconto = getValorPremio() - (getValorPremio() * 0.05);
        }
        else{
            desconto = getValorPremio();
        }

        setValorPremio(desconto);
    }

    // Visualização dos dados de acordo com o solicitado
    public String printData() {

        String data;
        
        data = "\nNome Segurado: " + getNomeSegurado() + 
                "\nIdade: " + String.valueOf(getIdade()) +
                "\nValor do Premio: " + String.valueOf(getValorPremio()) + "\n\n";

        return data;
    }
}

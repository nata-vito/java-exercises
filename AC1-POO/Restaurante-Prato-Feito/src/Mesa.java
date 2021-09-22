import java.text.DecimalFormat;
import java.util.Scanner;

public class Mesa {
    private int numero, qtdPessoas;
    private double totalConta, valorPessoa;

    // Iniciando os parâmetro com valores default
    public Mesa(){  
        setNumero(0);
        setQtdPessoas(0);
        setTotalConta(0);
        setvalorPessoa(0);
    }


    public double getvalorPessoa() {
        return valorPessoa;
    }

    public void setvalorPessoa(double valorPessoa) {
        this.valorPessoa = valorPessoa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public double getTotalConta() {
        return totalConta;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }

    // Cálculo do valor total do pedido 
    public void pedidoProdutos() {
        Scanner in = new Scanner(System.in);
        double valorConta = 0;
        int qtd, cod;

        System.out.print("\n1 - Refrigerante - R$ 2,00\n2 - Cachorro Quente - R$ 5,00\n3 - Batata Frita - R$ 4,00");
        System.out.print("\n\nQuantidade do item: ");
        qtd = in.nextInt();
        System.out.print("Código do Produto: ");
        cod = in.nextInt();

        if(cod == 1){
            valorConta = qtd * 2.00;
        }
        else if(cod == 2){
            valorConta = qtd * 5.00;
        }
        else if(cod == 3){
            valorConta = qtd * 4.00;
        }

        setTotalConta(valorConta+getTotalConta());
        in.nextLine();
    }

    // Cálculo do pagamento e descontos
    public void pagamento() {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        int op;
        double totalLiquido, valorPessoa;

        System.out.println("\nFormas de pagamento: \n1 - Dinheiro\n2 - Cheque\n3 - Cartão");
        System.out.print("\nForma de pagamento: ");
        op = in.nextInt();

        if(op == 1){
            totalLiquido = getTotalConta() - (getTotalConta()*0.1);
        }
        else if(op == 2){
            totalLiquido = getTotalConta();
        }
        else if(op == 3){
            totalLiquido = getTotalConta() - (getTotalConta()*0.05);
        }
        else{
            totalLiquido = getTotalConta();
        }

        // Cálculo do valor a ser pago por pessoa
        valorPessoa = totalLiquido/getQtdPessoas();

        System.out.println("Valor total liquido: R$" + df.format(totalLiquido));
        System.out.println("Valor por pessoa: R$" + df.format(valorPessoa));

        // É necessário passar como parâmetro para realizar a busca da mesa com o maior valor por pessoa 
        setvalorPessoa(valorPessoa);
    }

    // Imprimir dados da mesa 
    public String printMesa() {
        String data;

        data = "\nNúmero da mesa: " + getNumero() +
               "\nQuantidade de pessoas: " + getQtdPessoas() +
               "\nValor total: R$" + getTotalConta();

        return data;
    }
}

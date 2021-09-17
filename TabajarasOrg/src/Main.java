/* 
    A empresa “Organizações Tabajaras” precisa de um sistema que faça o controle da folha de pagamento de seus 
    funcionários. Sabe-se que um funcionário é identificado por um nome, departamento onde trabalha, seu salário
    bruto, o ano de entrada na empresa, seu RG, um valor que indique se o funcionário ainda está trabalhando
    na empresa ou se já foi demitido e quantos dependentes o Funcionáriopossui.

    o cálculo de aumento de salário (combase no salário bruto) é realizado de acordo comos seguintes dados:
    Tempo de Serviço menor que 5 anos – o percentual equivale a 5% 
    Tempo de Serviço maior que 5 anos – o percentual equivale a 8% 
    
    Segundo a descrição acima,implemente em Java a classe Funcionário. Após definir a classe Funcionário,
    defina a Classe AppFuncionario, para instanciar 3 objetos do tipo Funcionário e apresente o resultado 
    dos cálculos.
*/


public class Main {
    public static void main(String[] args) throws Exception {
        Tabajaras employer1 = new Tabajaras("Natanael", "Computação", 1500, 2021, 200032, 5, true);
        Tabajaras employer2 = new Tabajaras("José", "Civil", 3000, 2001, 200032, 5, true);
        Tabajaras employer3 = new Tabajaras("Tiago", "Elétrica", 5000, 2020, 200032, 5, true);
        employer1.printData();
        employer2.printData();
        employer3.printData();
    }
}

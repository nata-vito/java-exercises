/* 
    Precisa-se de uma classe para gerenciar as apólices de seguro da Seguradora Vera Cruz. Uma Apolice é descrita 
    pelos seguintes dados: nomeSegurado, idade e valorPremio. Serão necessárias as seguintes funcionalidades para 
    o gerenciamento das apólices: 

    a) Imprimir os dados da Apólice (nomeSegurado, idade e valorPremio). O retorno deverá ser uma String.

    b) Calcular o valor do Premio da Apolice seguindo as seguintes regras: 
        • Para idade maior ou igual a 18 e menor ou igual a 25 anos - valor do prêmio será acrescido em 20%.
        • Para idade superior a 25 e menor ou igual a 36 anos - valor do prêmio será acrescido em 15%. 
        • Para superior a 36 anos - valor será acrescido em 10%.

    c) Oferecer desconto no valor do prêmio de acordo com a cidade do segurado. O nome da cidade do 
    segurado deverá ser informado como parâmetro. Se a cidade for:
        • Curitiba, dê um desconto no valor do prêmio de 20%. 
        • Rio de Janeiro, dê um desconto no valor do prêmio de 15%. 
        • São Paulo, dê um desconto no valor do prêmio de 10%.
        • Belo Horizonte, dar um desconto no valor do prêmio de 5%.
        • Para as demais cidades não será oferecido desconto.

    Utilize os conceitos de Orientação a Objetos para implementar a descrição acima e contemple os 
    seguintes requisitos:

    • Escrever dois construtores. Um deles que recebe todos os parâmetros para iniciar seus atributos. 
    Um outro construtor que não recebe parâmetros e faz uma inicialização dos atributos com valores 
    default de acordo com o tipo de dado de cada atributo.

    • Implemente o conceito de encapsulamento. Com base na classe Apólice criada, 
    implementar a classe AppApolice contemplando os seguintes requisitos:

    • Criar dois objetos da classe Apolice. Utilize para cada criação 
    do objeto um construtor diferente. 

    • Para cada objeto criado:
        o Faça a impressão dos dados
        o Faça o cálculo da Apolice
        o Faça a impressão dos dados novamente
        o Faça o cálculo do desconto, informando como 
        parâmetros a cidade de Curitiba

    • Faça a impressão dos dados novamente
*/

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

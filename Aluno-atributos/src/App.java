/* 
    Crie uma classe para representar o tipo de dado Aluno.
    Em seguida crie um programa para ler e escrever os dados de um aluno.
*/


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno alunoA = new Aluno();
        Aluno alunoB = new Aluno("Maria");

        Scanner in = new Scanner(System.in);
        String nome, sexo, endereco, curso;
        int idade, rg;

        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Sexo: ");
        sexo = in.nextLine();
        System.out.print("Endereco: ");
        endereco = in.nextLine();
        System.out.print("Curso: ");
        curso = in.nextLine();
        System.out.print("Idade: ");
        idade = in.nextInt();
        System.out.print("RG: ");
        rg = in.nextInt();

        in.close();

        alunoA.setNome(nome);
        alunoA.setEndereco(endereco);
        alunoA.setSexo(sexo);
        alunoA.setCurso(curso);
        alunoA.setIdade(idade);
        alunoA.setRg(rg);       
        
        alunoA.print();

        alunoB.print();

    }
}

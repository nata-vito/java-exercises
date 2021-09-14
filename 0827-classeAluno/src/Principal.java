public class Principal {
    public static void main(String[] args) {
        classeAluno aluno = new classeAluno();
        
        aluno.setIdade(20);
        aluno.setNome("Natanael Vitorio");
        aluno.setAltura(1.7);
        aluno.setAnoAtual(2025);
        aluno.setAnoNascimento(2001);
        aluno.setPeso(50);
        aluno.setSexo("M");

        aluno.Imprimir();
    }
}

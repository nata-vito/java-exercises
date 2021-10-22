import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeDisci, nomeProfe, titulo;
        int chDisc, chLecio;
        Scanner in = new Scanner(System.in);
       
        System.out.print("Nome da disciplina: ");
        nomeDisci = in.nextLine();

        System.out.print("Carga Horária da Disciplina: ");
        chDisc = in.nextInt();

        System.out.print("Nome do Professor: ");
        nomeProfe = in.nextLine();

        System.out.print("Titulação: ");
        titulo = in.nextLine();

        System.out.print("Carga Horária Lecionada: ");
        chLecio = in.nextInt();

        Professor p = new Professor(nomeProfe, titulo, chLecio);
        Disciplina d = new Disciplina(nomeDisci, chDisc, p);
    }
}

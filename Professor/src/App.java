import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeDisci, nomeProfe, titulo;
        int chDisc, chLecio;
        Scanner in = new Scanner(System.in);
        System.out.print("Nome da disciplina: ");
        nomeDisci = in.nextLine();

        System.out.print("Carga Horária da Disciplina: ");
        chDisc = Integer.parseInt(in.nextLine());               // dessa forma não ocorre o bug de pular a entrada, para saber mais acesse: https://www.ti-enxame.com/pt/java/scanner-esta-pulando-nextline-depois-de-usar-next-ou-nextfoo/1068736209/
        
        System.out.print("Nome do Professor: ");
        nomeProfe = in.nextLine();

        System.out.print("Titulação: ");
        titulo = in.nextLine();

        System.out.print("Carga Horária Lecionada: ");
        chLecio = in.nextInt();
        in.close();

        // Criação dos objetos
        Professor p = new Professor(nomeProfe, titulo, chLecio);
        Disciplina d = new Disciplina(nomeDisci, chDisc, p);
        Professor p2 = new Professor("José", "Especialista", 20);

        // Inserindo professor 2 na lista 
        d.InsertProfessor(p2);

        // Listar todos os professores
        ArrayList <Professor> aux;
        aux = d.getListaProfessores();

        System.out.println("Professores que lecionam a disciplina: " + d.getNome());

        for(int i = 0; i < aux.size(); i++){
            System.out.println(aux.get(i).getNome());
        }
        
    }
}

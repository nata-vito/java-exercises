/* 
    Construa um programa em Java que calcule a média de dois alunos e 
    imprima o nome e a matricula do que tiver a maior média. Para cada 
    aluno são armazenadas as seguintes informações:
    
    a)Nome
    b)Matricula
    c)Notas Finais em 5 disciplinas
    
    Obs: utilize um vetor para armazenar as notas  
*/
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {  
        Student student[] = new Student[2];
        Scanner in = new Scanner(System.in);
        String name;
        int i, ra;
        
        for(i = 0; i < 3; i++){
            System.out.printf("Name: ");
            name = in.nextLine();
            student[i].setName(name);

            System.out.printf("Ra: ");
            ra = in.nextInt();
            student[i].setName(name);

            for(int a = 0; a < 5; a++){
                System.out.printf("Nota %d: ", a+1);
                student[i].noteInput();
            }


        }

        
    }
}

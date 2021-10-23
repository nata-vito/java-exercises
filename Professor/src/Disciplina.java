import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int ch;
    private ArrayList <Professor> listaProfessores = new ArrayList<>();                    // Associação

    public Disciplina(String nome, int ch, Professor p){
        this.nome = nome;
        this.ch = ch;
        this.listaProfessores.add(p);
    }

    /* 
    // É possível fazer isso, mas não é o ideal
    public void setProfessor(Professor p){
        listaProfessores.add(p)
    } 
    */

    public void InsertProfessor(Professor p){
           listaProfessores.add(p);
    }

    // Devolve a referência do arraylist de listaProfessores
    public ArrayList<Professor> getListaProfessores(){
        return listaProfessores;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }


}

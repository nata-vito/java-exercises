public class Disciplina {
    private String nome;
    private int ch;
    private Professor p;

    public Disciplina(String nome, int ch, Professor p){
        this.nome = nome;
        this.ch = ch;
        this.p = p;
    }

    public Professor getProfessor() {
        return p;
    }

    public void setProfessor(Professor p){
        this.p = p;
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

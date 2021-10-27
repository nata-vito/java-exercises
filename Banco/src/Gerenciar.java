import java.util.ArrayList;

public class Gerenciar {

    private ArrayList <Conta> listaContas;

    public Gerenciar(ArrayList<Conta> listaContas) {
        this.listaContas = new ArrayList<Conta>();
    }

    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public void Add(Conta e) {
        this.listaContas.add(e);
    }

    /* 
        Fazer os outros métodos
        b2.3...
    */
}

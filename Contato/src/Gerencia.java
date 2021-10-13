import java.util.ArrayList;

public class Gerencia {
    
    private ArrayList<Contato> listaContatos = new ArrayList<Contato>();

    public void Adicionar(Contato objContato) {
        this.listaContatos.add(objContato);
    }

    
}

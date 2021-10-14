import java.util.ArrayList;

public class Gerencia {
    
    private ArrayList<Contato> listaContatos = new ArrayList<Contato>();

    public ArrayList<Contato> getListaContatos(){
        return this.listaContatos;
    }

    public void Adicionar(Contato objContato) {
        this.listaContatos.add(objContato);
    }

    public Contato Busca( String nome ){
        
        for(int i = 0; i > listaContatos.size(); i++){
                if (nome.equalsIgnoreCase(listaContatos.get(i).getNome())){             //Encontra o contato pelo nome
                    return listaContatos.get(i);
                }
        }

        return null;
    }

    public void excluirContato( String nome ) {
        Contato objContato;

        objContato = Busca(nome);

        this.listaContatos.remove(objContato);
    }

    public Contato editarContato( Contato objContato, String nome, String endereco, String telefone, String email ) {
       objContato.setNome(nome);
       objContato.setEndereco(endereco);
       objContato.setTelefone(telefone);
       objContato.setEmail(email);

       return objContato;
    }

    public void visualizar() {
        for(int i = 0; i < listaContatos.size(); i++){
            listaContatos.get(i).imprime();
        }
    }
}

import java.util.*;

public class Gerenciar {
    private ArrayList <Proprietario> listaProprietarios;

    public ArrayList<Proprietario> getListaProprietarios() {
        return listaProprietarios;
    }

    public void setListaProprietarios(ArrayList<Proprietario> listaProprietarios) {
        this.listaProprietarios = listaProprietarios;
    }

    public Gerenciar(){
        listaProprietarios = new ArrayList<Proprietario>();
    }

    public void Insert(Proprietario objProprietario) {
        this.listaProprietarios.add(objProprietario);
    }
    
    public String PrintAll() {
        String info = "\n";

        for(int i = 0; i < this.listaProprietarios.size(); i++){
            info += "\nProprietario: " + i + this.listaProprietarios.get(i).imprimir() + "\n----------------------------------------\n";
        } 
        
       
        /* OR */

        /* 
        int i = 0;
        for(Proprietario objProprietario: listaProprietarios){
            info += "\n\nProprietario: " + i + this.listaProprietarios.get(i).imprimir();
            i++;
        } 
        */
        return info;
    }

    public String Seach(String raca) {
        
        String name = "\nDonos da raça: " + raca;

        for(Proprietario objProprietario: this.listaProprietarios){
            if (objProprietario.getAnimal().getRaca().equalsIgnoreCase(raca)){
                name += " " + objProprietario.getNome();
            }
        }

        return name;    
    }
}

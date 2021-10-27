import java.util.ArrayList;

public class Gerenciar {
    private ArrayList <Funcionario> listaFuncionarios;

    public Gerenciar(){
        this.listaFuncionarios = new ArrayList<Funcionario>();
    }

    // Adiciona funcionario a lista
    public void Add(Funcionario fun) {
        listaFuncionarios.add(fun);
    }

    public String Print() {
        String info = "";

        if(listaFuncionarios.size() == 0){
            info += "\nLista vazia!";
        }

        for(Funcionario objFunc: this.listaFuncionarios){
            info += "\n=================\n";
            info += objFunc.Print();
        }

        return info;
    }

    public Funcionario Search(String cpf) {

        for(Funcionario objFunc: this.listaFuncionarios){
            if(objFunc.getCpf().equalsIgnoreCase(cpf)){
                return objFunc;
            }
        }
        
        return null;
    }
}
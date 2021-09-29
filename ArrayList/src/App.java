import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa("Natanael", 20);
        Pessoa p1 = new Pessoa("Samuel", 16);
        ArrayList <Pessoa> l = new ArrayList <Pessoa>();
        // referência
        Pessoa rp;
        rp = p;

        System.out.println("Nome de p: "+ p.getNome());
        System.out.println("Nome de rp: "+ rp.getNome());

        rp = p1;
        l.add(p);
        System.out.println("Nome de rp: "+ rp.getNome());

        System.out.println("Tamanho da lista: " + l.size());

        // inserção do elemento pessoa
        l.add(p1);
        System.out.println("Tamanho da lista: " + l.size());

        l.add(new Pessoa("Rita", 21));
        System.out.println("Tamanho da lista: " + l.size());

        // Leitura dos dados do ArrayList
        System.out.println("Pocisão 1: " + l.get(0).getNome());
        System.out.println("Pocisão 2: " + l.get(1).getNome());
        System.out.println("Pocisão 2: " + l.get(2).getNome());
        
    }
}

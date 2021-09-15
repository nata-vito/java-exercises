/* 
        Construa um programa em Java que crie um classe para representar as
        informações sobre 3 vinhos: 
        
        a) nome vinho 
        b) tipo 
        c) ano de Fabricação 
        b) preço 

        A partir disto faça a leitura das informações de 3 vinhos e imprima o 
        nome do vinho mais caro e do vinho mais velho.
 */
import java.util.*;

public class Wines {
    public static void main(String[] args) throws Exception {
        Vinicule wine[] = new Vinicule[3];
        Scanner in = new Scanner(System.in);
        String wineName, type;
        int manufacYear, i = 0, expensive = 0, older = 0;
        double price, most = 0, year = 0;

        while(i < 3){
            wine[i] = new Vinicule();

            System.out.print("\n\nWine name: ");
            wineName = in.next();
            wine[i].setWineName(wineName);

            System.out.print("Wine type: ");
            type = in.next();
            wine[i].setType(type);

            System.out.print("Manufacturing Year: ");
            manufacYear = in.nextInt();
            wine[i].setManufacYear(manufacYear);

            System.out.print("Price: ");
            price = in.nextDouble();
            wine[i].setPrice(price);
            i++;
        }

        year = wine[0].getManufacYear();

        for(i = 0; i<3; i++){
            if(wine[i].getPrice() > most){
                most = wine[i].getPrice();
                expensive = i;
            }
            if(wine[i].getManufacYear() < year){
                year = wine[i].getManufacYear();
                older = i;
            }
        }

        System.out.println("\n\nExpensive wine");
        wine[expensive].printName();
        System.out.println("\nOlder wine");
        wine[older].printName();
    }
}

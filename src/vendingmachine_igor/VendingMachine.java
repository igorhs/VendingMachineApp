package vendingmachine_igor;

import java.util.ArrayList;

/**
 *
 * @author Igor Henrique da Silva
 */
 
//Commentaries were set up both in English and Portuguese.

//Criando a classe "VendingMachine".
//Creating the class "VendingMachine"
public class VendingMachine {
    
    //Criando uma ArrayList "p" do tipo "Products".
    //Creating an ArrayList "p" from "Products".
    public static ArrayList<Products> p = new ArrayList<>(5);
    
    //ArrayList criada para reestocar os produtos.
    //Creating an ArrayList to restock products.
    public ArrayList restockProducts(){
        p.add(new Products("Coca-Cola", 1.5, 4));
        p.add(new Products("Fanta", 1, 3));
        p.add(new Products("Sprite", 1, 4));
        p.add(new Products("Doritos", 2.45, 4));
        p.add(new Products("Lays", 2, 4));
        return p;
    }
}

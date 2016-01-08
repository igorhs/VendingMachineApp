package vendingmachine_igor;

import java.util.ArrayList;

/**
 *
 * @author Igor Henrique da Silva
 */
public class VendingMachine {
    
    public static ArrayList<Products> p = new ArrayList<>(5);
    
    public ArrayList restockProducts(){
        p.add(new Products("Coca-Cola", 1.5, 4));
        p.add(new Products("Fanta", 1, 3));
        p.add(new Products("Sprite", 1, 4));
        p.add(new Products("Doritos", 2.45, 4));
        p.add(new Products("Lays", 2, 4));
        return p;
    }
    
}

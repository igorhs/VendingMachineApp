package vendingmachine_igor;


/**
 *
 * @author Igor Henrique da Silva
 */
 
//Commentaries were set up both in English and Portuguese.

//Criando a classe "Products".
//Creating the class "Products".
public class Products {
    private String name;
    private double price;
    private int quantity;

    //Gerando getters e setters para os atributos "name", "price" e "quantity".
    //Generating getters and setters for the "name", "price", and "quantity" attributes.
    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

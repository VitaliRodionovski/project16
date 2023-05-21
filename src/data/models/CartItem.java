package data.models;

public class CartItem {
    //Product, count
    public final Product product;
    public final int count;
    //создадим  коструктор КартИтем
    public  CartItem (Product product, int count){
        this.product = product;
        this.count = count;
    }
}

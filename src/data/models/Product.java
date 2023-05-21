package data.models;

public class Product {
    //мы уже создали класс Продукт
    //id, title, description, price, available
    public final String id;
    public final String title;
    public final String description;
    public final int price;
    public final boolean available;
    // заполнили его полями
    //затем сделаем генерацию конструктора на основе этих данных
    public Product(String id, String title, String description, int price, boolean available){
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.available = available;
        // этот конструктор примет значения из круглых скобок и назначит их в дальнейшем.
        //Т.к. эти переменные final они будут использоваться тоько в этом конструкторе.

    }

}

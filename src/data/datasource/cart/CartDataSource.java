package data.datasource.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    //Сдесь будет метод получения корзины. И мы должны уметь добавлять товар(первый метод)
    public abstract void addToCart(Product product, int count);

    //это наш продукт с каким-то кол-ом инт
    public abstract ArrayList<CartItem> getCart();
    //возвращает в нашу корзину
}

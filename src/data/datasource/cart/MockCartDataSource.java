package data.datasource.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public class MockCartDataSource  extends  CartDataSource{
    //создадим поле, составим эррей лист картайтомов. Не забываем, что корзина - массив.
    private ArrayList<CartItem> cart = new ArrayList<>();


    @Override
    public void addToCart(Product product, int count) {
        // сдесь мы просто добавляем в нашу корзину new cartitem
        cart.add(new CartItem(product, count));
    }

    @Override
    public ArrayList<CartItem> getCart() {
        //метод, который возвращает в корзину
        return cart;
    }
}
//иплементируем 2 метода
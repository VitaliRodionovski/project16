package view;

import common.AppView;
import data.models.CartItem;
import data.services.ShopService;

import java.util.ArrayList;

public class CartView extends AppView {
    //иплементируем метод и конструктор
    final ShopService shopService;
    public CartView(ShopService shopService) {
        //нам не нужен тот массив, мы создадим новый
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();
                //каждую операцию есть какой-то картИтем
        for (CartItem item : cart){
            System.out.println(item.product.id + " " + item.product.title + " " + item.product.price);
        }
        System.out.println();
    }
}

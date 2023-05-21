package view;

import common.AppView;
import data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToCart extends AppView {
    //иплементируем метод и конструктор
    final ShopService shopService;

    public AddToCart(ShopService shopService) {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        //идёт с использованием сканера
        //здесь мы буде добавлять товары
        Scanner in = new Scanner(System.in);
        System.out.println("Enter product id: ");
        // мы буде принимать сюда строку
        String productId = in.nextLine();
        if (productId == null) {
            return;
            //для того, чтобы начать от "Enter product id: "
        }
        System.out.println("Enter count: ");
        int count = in.nextInt();
        final boolean res = shopService.addToCart(productId, count);
        //если будет неправильный Id, то не поучится добавить
        if (res) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}

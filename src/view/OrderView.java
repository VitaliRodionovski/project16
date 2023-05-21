package view;

import common.AppView;
import data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView extends AppView {
    //иплементируем метод и конструктор
     final ShopService shopService;
    public OrderView(ShopService shopService) {
        super("Odering",new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        //мы должны принять данные с клавиатуры, чтобы оформить в нашем ордере
        Scanner in = new Scanner(System.in);
        // небоьшая подсказка для поьзователя
        System.out.println("Enter your name");
        String name = in.nextLine();
        // небоьшая подсказка для поьзователя
        System.out.println("Enter your phone:");
        String phone = in.nextLine();
        shopService.createOrder(name, phone, "addres", "МИР", "any time");
    }
}

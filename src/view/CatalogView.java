package view;

import common.AppView;
import data.models.Product;
import data.services.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {
    //т.к. мы будем пользоваться шоп сервисом, мы пишем это:
    final ShopService shopService;
    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        // тот самый shopService мы будем обозначать в конструкторе.
        //они будут получать внутрь объекты шоп сервис, которые будут сюда назначать
        super("Catalog",children);
        this.shopService = shopService;
    }

    //иплементируем метод и конструктор
    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        //гетКаталог мы будем вызывать через ШопСервис.
        //Потом пройдёмся по циклу
        for (Product p : catalog){
            System.out.println(p.id + " " + p.title + " " + p.price);
        }
        System.out.println();
    }
}

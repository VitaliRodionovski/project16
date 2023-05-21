import common.AppView;
import common.PageLoop;
import data.datasource.cart.CartDataSource;
import data.datasource.cart.MockCartDataSource;
import data.datasource.catalog.CatalogDataSource;
import data.datasource.catalog.MockCatalogDataSource;
import data.datasource.order.MockOrderDataSource;
import data.datasource.order.OrderDataSource;
import data.services.ShopService;
import view.CartView;
import view.CatalogView;
import view.MainView;
import view.OrderView;

import java.util.ArrayList;

public class Main {
    /*
    Product - id, title, description, price, available
    CartItem - Product, count
    Oder - name, phone, address, paymentType,deliveryTime, List<CartItem> cart

    Фичи:
         - просмотр каталога
         - добавление в корзину по id
         - сколько штук
         - просмотр корзины
         - оформить заказ
         - ввод данных
     */
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSource();
        CartDataSource cartDataSource = new MockCartDataSource();
        OrderDataSource orderDataSource = new MockOrderDataSource();
        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);
        //начинаем создавать страницы
        AppView addToCart = new CartView(shopService);
        //она пренимает шопсервис
        //создаём эрей лист
        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCart);
        //Когда мы создаём каталог мы бы могли передать каталогчилдрен
        AppView catalogView = new CatalogView(shopService, catalogChildren);
        //мы создали страничку каталога

        AppView cartView = new CartView(shopService);
        //это быдет сама корзина
        AppView orderView = new OrderView(shopService);

        //создадим ещё один ArrayList
        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);

        AppView mainView = new MainView(mainChildren);
                // принимает в себя массив
        new PageLoop(mainView).run();
    }
}

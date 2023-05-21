package data.services;

import data.datasource.cart.CartDataSource;
import data.datasource.catalog.CatalogDataSource;
import data.datasource.order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    //построим конструктор по этим объектам
    public ShopService(CatalogDataSource catalogDataSource, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    //мы получаем объекты по классам
    //нам нужно обеспечить просмотр каталога
    public ArrayList<Product> getCatalog() {
        //метод, который позволит получчить нам каталог
        return catalogDataSource.getCatalog();
        //вызываем геткаталог
    }

    // построим метод добавления в корзины из каталога
    public boolean addToCart(String productId, int count) {
        ArrayList<Product> products = getCatalog();
        for (Product p : products) {
            if(p.id.equals(productId)){
                // мы в корзину будем добавлять это продукт по кол-вам
                cartDataSource.addToCart(p, count);
                //еси получилось, то возвращаем тру, если нет, то мы вышли из цикла
                return true;
            }
        }
        return false;
    }
    // просмотр корзины
    public ArrayList<CartItem> getCart(){
        return cartDataSource.getCart();
    }
    //мы будем добавлять пользовтеля с клавиатуры
    public void createOrder(String name, String phone, String addres,
                            String paymentType, String deliveryTime){
        ArrayList<CartItem> cart = getCart();
        //данные ордера
        Order order = new Order(name, phone, addres, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(order);
    }
}

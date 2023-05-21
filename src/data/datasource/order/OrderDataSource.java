package data.datasource.order;

import data.models.Order;

public abstract class OrderDataSource {
    public abstract void createOrder(Order order);
    public abstract Order getOrder();
    //работа с данными заказа будет состоять из содания этого ордера
}

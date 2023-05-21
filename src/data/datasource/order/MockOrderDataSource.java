package data.datasource.order;

import data.models.Order;

public class MockOrderDataSource extends OrderDataSource{
    private Order order;
    //иплементируем 2 метода
    @Override
    public void createOrder(Order order) {
        //здесь мы будем назначать метод ордер
        this.order = order;

    }

    @Override
    public Order getOrder() {
        //а здесь возвращать
        return order;
    }
}

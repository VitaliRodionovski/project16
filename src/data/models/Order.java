package data.models;

import java.util.ArrayList;

public class Order {
    //name, phone, address, paymentType,deliveryTime, List<CartItem> cart
    public  final String name;
    public  final String phone;
    public  final String addres;
    public  final String paymentType;
    public  final String deliveryTime;
    public  final ArrayList<CartItem> cart;//это корзина, которая содержит отдельные элементы корзины
    // почти все файлы, которые будет вводить пльзователь, будут стрингами

    public Order(String name, String phone, String addres, String paymentType, String deliveryTime, ArrayList<CartItem> cart){
        this.name = name;
        this.phone = phone;
        this.addres = addres;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cart = cart;
        //этот объект хранит в себе данные для свершения заказов
    }
}

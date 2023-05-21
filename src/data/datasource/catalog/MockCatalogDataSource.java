package data.datasource.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSource extends CatalogDataSource {
    //класс, который будет работать с данными каталога
    @Override
    public ArrayList<Product> getCatalog() {
        //он должен возвращать список
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("id1", "SmartPhone", "Best SmartPhone", 1000, true));
        products.add(new Product("id2", "Laptop", "Best Laptop", 2000, true));
        products.add(new Product("id3", "Watch", "Best Watch", 500, true));
        products.add(new Product("id4", "Phone", "Best Phone", 100, true));
        //мы добавляем в продукс.add наши товары
        return products;
        //мы возвращаем продукт
    }
} //занесли метод из каталогдатасоурс



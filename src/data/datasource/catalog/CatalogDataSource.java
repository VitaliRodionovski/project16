package data.datasource.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    //мы сделали это класс абстрактным для того, чтобы оисать как мы должны работать с данными
    //это класс, который будет работать с данными каталога
    public abstract ArrayList<Product> getCatalog();
    //теперь он может дать посмотреть на сам католог
}

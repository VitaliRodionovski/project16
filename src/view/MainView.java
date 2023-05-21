package view;

import common.AppView;

import java.util.ArrayList;

public class MainView extends AppView {
    //иплементируем метод и конструктор
    public MainView( ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {

    }
}

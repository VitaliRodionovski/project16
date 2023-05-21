package common;

import java.util.ArrayList;

public abstract class AppView {
    //здесь мы опишем общее поведение для папки view
    public final String title;
    public final ArrayList<AppView> children;
    //создадим конструктор

    public AppView(String title, ArrayList<AppView> children){
        this.title = title;
        this.children = children;
    }

    public abstract void action();
    //создадим метод, который будет в каждом конкретном пункте миню, которая будет наследоваться от AppView, он бует отвечать за отрисовку чего-то конкретного
    //в этом пункте
}

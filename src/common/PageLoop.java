package common;

import java.util.Scanner;

public class PageLoop {
    // класс который будет отвечать за переключение между пунктами миню
    final AppView view;

    //создаём конструктор
    public PageLoop(AppView view) {
        this.view = view;
    }

    public void run() {
        //метод, который будет помогать переключаться,
        //в бесконечном цике мы сначала вызываем view action()
        while (true) {
            view.action();
            displayChildren();
            //спрашиваем пользователя через сканер, что он хоет ввести
            Scanner in = new Scanner(System.in);
            //конкретная цифра пункта меню
            int value = in.nextInt();
            if(value <0 || value > view.children.size()+1){
                System.out.println("Wrong value!");
            }else if (value == view. children.size() +1){
                // тот самый пункт, который обязывает нас вернуться назад
                break;
            }else{
                // в противном случае
                AppView selectedView = view.children.get(value - 1);
               new PageLoop(selectedView).run();
               //мы возвращаемся в наружное меню
            }
        }
    }

    private void displayChildren() {
        System.out.println(view.title);
        System.out.println("Choose from 1 to " + (view.children.size() + 1) + "");
        //на один больше, чтобы была возможность выбрать ещё один пункт, чтобы выйти назад.
        //в цикле мы будем выводить на экран:
        for (int i = 0; i < view.children.size(); i++) {
            AppView childView = view.children.get(i);
            System.out.println(i + 1 + " - " + childView.title);
        }
        System.out.println(view.children.size() + 1 + " - Back");
    }
}

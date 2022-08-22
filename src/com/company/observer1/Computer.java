package com.company.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description subject(被观察者)
 * @Author wangkai
 * @Date 2022/8/22 23:11
 */
public class Computer {

    List<Listener> listenerList = new ArrayList<>();

    void addListener(Listener listener){
        listenerList.add(listener);
    }

    public void click(){

        ClickEvent clickEvent = new ClickEvent();
        System.out.println("click A");
        listenerList.forEach(u->{
            if(u instanceof ClickListener){
                u.actionPerformance(clickEvent);
            }
        });
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.addListener(new ClickListener());
        computer.addListener(new KeyListener());
        computer.click();
    }
}

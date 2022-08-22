package com.company.observer1;

/**
 * @Description 具体observer
 * @Author wangkai
 * @Date 2022/8/22 23:16
 */
public class KeyListener implements Listener{

    @Override
    public void actionPerformance(Event event) {
        System.out.println("KeyListener");
    }
}

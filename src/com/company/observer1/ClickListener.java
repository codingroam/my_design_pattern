package com.company.observer1;

/**
 * @Description 具体observer
 * @Author wangkai
 * @Date 2022/8/22 23:03
 */
public class ClickListener implements Listener{


    @Override
    public void actionPerformance(Event event) {
        ClickEvent clickEvent = (ClickEvent)event;
        System.out.println("ClickListener" + "clicktype=" + clickEvent.getClickType());
        System.out.println(event.getSource());

    }
}

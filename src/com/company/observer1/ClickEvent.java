package com.company.observer1;

/**
 * @Description event 具体事件
 * @Author wangkai
 * @Date 2022/8/22 22:58
 */
public class ClickEvent implements Event<ClickEvent>{

    private String clickType = "single";

    public String getClickType() {
        return clickType;
    }

    public void setClickType(String clickType) {
        this.clickType = clickType;
    }

    @Override
    public ClickEvent getSource() {
        return this;
    }
}

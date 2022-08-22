package com.company.observer1;

/**
 * @Description 具体事件
 * @Author wangkai
 * @Date 2022/8/22 22:59
 */
public class KeyEvent implements Event<KeyEvent>{

    private int num = 26;
    @Override
    public KeyEvent getSource() {
        return this;
    }
}

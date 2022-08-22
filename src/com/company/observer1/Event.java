package com.company.observer1;

/**
 * 抽象事件
 * @param <T>
 */
public interface Event<T> {

    T getSource();

}

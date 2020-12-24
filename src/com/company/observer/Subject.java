package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
     List<Observer> observerList = new ArrayList<>();
     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObserver();


}

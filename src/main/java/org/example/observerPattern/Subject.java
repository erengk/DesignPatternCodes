package org.example.observerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

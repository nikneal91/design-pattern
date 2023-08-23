package memento.gui;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> articles = new ArrayList<>();

    public void addMemento(Memento memento) {
        articles.add(memento);
    }

    public Memento getMemento(int index) {
        return articles.get(index);
    }

}

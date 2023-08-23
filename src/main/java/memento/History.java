package memento;

import dp.iterator.BrowseHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class History {

    private Stack<EditorState> states = new Stack<>();

    public void push (EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {

        private History history;
        private int index;
        private List<EditorState> list=new ArrayList<>();

        public ListIterator(History history) {
            this.history =history;
            list.addAll(history.states);
        }

        @Override
        public boolean hasNext() {
            return index< list.size();
        }

        @Override
        public String current() {
            return list.get(index).getContent();
        }

        @Override
        public void next() {
            index++;
        }
    }

}

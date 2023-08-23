package memento.exercise;

import java.util.Stack;

public class DocumentHistory {

    private Stack<DocumentState> states = new Stack<>();

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        if ( !states.isEmpty()) {
            return states.pop();
        } else {
            return null;
        }

    }

}

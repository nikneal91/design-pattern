package dp.command.editor;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Hisitory {

    private Deque<UndoAction> commands = new LinkedList<>();

    public void push(UndoAction command) {
        commands.add(command);
    }

    public int size() {
        return commands.size();
    }

    public UndoAction pop() {
        return commands.pop();
    }

}

package dp.command.editor;

public interface UndoAction extends Action{
    public void unexecute();
}

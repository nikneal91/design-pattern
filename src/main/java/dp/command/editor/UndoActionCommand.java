package dp.command.editor;

public class UndoActionCommand implements Action{

    private  Hisitory hisitory;

    public UndoActionCommand(Hisitory hisitory) {
        this.hisitory = hisitory;
    }

    @Override
    public void execute() {
        if ( hisitory.size()>0)
            hisitory.pop().unexecute();
    }
}

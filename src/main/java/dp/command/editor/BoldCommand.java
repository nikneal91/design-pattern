package dp.command.editor;

public class BoldCommand implements UndoAction{
    private String prevContent;

    public BoldCommand(HTMLDocument document, Hisitory history) {
        this.document = document;
        this.history = history;
    }

    private HTMLDocument document;
    private Hisitory history;

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);

    }
}

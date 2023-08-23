package dp.command.editor;

public class UndoMain {
    public static void main(String[] args) {
        Hisitory hisitory = new Hisitory();
        HTMLDocument document = new HTMLDocument();
        document.setContent("Hello world");
        BoldCommand command = new BoldCommand(document, hisitory);
        System.out.println(document.getContent());
        command.execute();
        System.out.println("After execute");
        System.out.println(document.getContent());
        UndoActionCommand undo = new UndoActionCommand(hisitory);
        undo.execute();
        System.out.println("After execute");
        System.out.println(document.getContent());


    }

}




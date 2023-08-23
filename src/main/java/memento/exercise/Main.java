package memento.exercise;

public class Main {




    public static void main(String[] args) {
        Document document = new Document("first","Times","12px");
        DocumentHistory history = new DocumentHistory();
        App handler = new App(document,history);
        handler.changeText("Second");
        handler.changeText("Third");
        System.out.println(handler.getDoc().toString());
        handler.undo();
        System.out.println(handler.getDoc().toString());
        handler.undo();
        System.out.println(handler.getDoc().toString());
    }
}

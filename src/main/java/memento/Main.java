package memento;

public class Main {

    private static void printHistory(History history) {
        System.out.println("Print history Start !!");
        Iterator itr = history.createIterator();
        while (itr.hasNext())  {
            System.out.println(itr.current());
            itr.next();
        }
        System.out.println("Print history End !!");
    }


    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        printHistory(history);
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        printHistory(history);
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        printHistory(history);
    }

}

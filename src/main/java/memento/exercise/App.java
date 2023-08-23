package memento.exercise;

public class App {

    private Document doc;
    private DocumentHistory history;

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public App(Document doc, DocumentHistory history) {
        this.doc =doc;
        this.history =history;
    }

    public void changeText(String title) {
        this.save();
        this.doc.setContent(title);
    }

    public void save() {
        history.push(doc.createState());
    }

    public void undo() {
        doc.restore(history.pop());
    }

}

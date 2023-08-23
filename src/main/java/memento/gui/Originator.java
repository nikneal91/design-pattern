package memento.gui;

public class Originator {

    private String article;

    public void setArticle(String article) {
        System.out.println("From Originator : current version of article " + article);
        this.article=article;
    }

    public Memento saveInMemento() {
        return new Memento(article);
    }

    public String restore(Memento memento) {
        return memento.getArticle();
    }


}

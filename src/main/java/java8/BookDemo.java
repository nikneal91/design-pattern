package java8;


import java.util.*;

class Book {
    private String title;
    private String author;

    static Map<String,Integer> hashes = new HashMap<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) || Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        System.out.println("author " + author);
        if (hashes.containsKey(author))
            return hashes.get(author);
        else
            hashes.put(author,Objects.hash(title));
            return Objects.hash(title);
    }

}

public class BookDemo {

    public static void main(String[] args) {
        Book b1 = new Book("t1","a1");
        Book b2 = new Book("t2","a1");
        Book b3 = new Book("t1","a2");
        System.out.println(b1.hashCode() + " " + b2.hashCode());
        Set<Book> hashSet = new HashSet<>();
        hashSet.add(b1);
        hashSet.add(b2);
        System.out.println(hashSet.size());

    }

}

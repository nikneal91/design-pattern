
package dp.iterator;

public class Main {

    public static void main(String[] args) {
        BrowseHistoryArray history = new BrowseHistoryArray();
        history.push("www.google.com");
        history.push("www.facebook.com");
        history.push("www.youtube.com");
        Iterator iterator = history.createIterator();
        while ( iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }


}

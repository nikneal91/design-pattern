package dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryArray {

    private String[] urls = new String[10];
    int count;
    public void push(String url) {
        urls[count++]=url;
    }

    public String pop() {
        return urls[--count];
    }

//    public List<String> getUrls() {
//        return this.urls;
//    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }



    public class ArrayIterator implements Iterator<String> {

        private BrowseHistoryArray history;
        private int index;

        public ArrayIterator(BrowseHistoryArray history) {
            this.history =history;
        }

        @Override
        public boolean hasNext() {
            return index< history.count;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}

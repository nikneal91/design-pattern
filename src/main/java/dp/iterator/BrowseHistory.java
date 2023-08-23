package dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size()-1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }



    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history =history;
        }

        @Override
        public boolean hasNext() {
            return index< history.urls.size();
        }

        @Override
        public String current() {
            return history.getUrls().get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}

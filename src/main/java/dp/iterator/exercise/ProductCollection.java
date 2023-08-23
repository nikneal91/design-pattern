package dp.iterator.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator<Product> createIterator() {
      return new ListIterator(this);
  }

  private class ListIterator implements Iterator<Product> {

    private ProductCollection productCollections;
    private int index;

    public ListIterator(ProductCollection collection) {
      this.productCollections = collection;
    }


    @Override
    public boolean hasNext() {
      return index < productCollections.products.size();
    }

    @Override
    public Product current() {
      return productCollections.products.get(index);
    }

    @Override
    public void next() {
        index++;
    }
  }

}

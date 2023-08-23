package dp.iterator.exercise;

public class Main {

    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1,"Shirt"));
        collection.add(new Product(2,"Pant"));
        collection.add(new Product(3,"Tie"));
        collection.add(new Product(4,"Jeans"));
        collection.add(new Product(5,"Belt"));
        Iterator<Product> iterator = collection.createIterator();
        while ( iterator.hasNext()) {
            System.out.println(iterator.current().toString());
            iterator.next();
        }
    }
}

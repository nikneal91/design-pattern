package java8.thread;


import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(1000);
    }
}

public class Main {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> result = service.submit(new Task());
        try {
            System.out.println("Received " + result.get());
        } catch (Exception e) {
            System.out.println("Exception occured "+ e.getCause());
        }
    }
}

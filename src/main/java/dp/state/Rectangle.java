package dp.state;

public class Rectangle extends Tool{
    @Override
    void mouseUp() {
        System.out.println("Show rectangle icon");
    }

    @Override
    void mouseDown() {
        System.out.println("Draw a dashed rectangle");
    }
}

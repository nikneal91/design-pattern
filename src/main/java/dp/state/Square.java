package dp.state;

public class Square extends Tool{
    @Override
    void mouseUp() {
        System.out.println("Draw Square Icon");
    }

    @Override
    void mouseDown() {
        System.out.println("Draw a square!!");
    }
}

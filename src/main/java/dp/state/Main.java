package dp.state;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Rectangle());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println("Change tool selection");
        canvas.setCurrentTool(new Square());
        canvas.mouseUp();
        canvas.mouseDown();

    }
}

package dp.command;

import dp.command.fx.Button;
import dp.command.fx.Command;

public class CompositeMain {

    public static void main(String[] args) {
        CompositeCommand composite = new CompositeCommand();
        Command resize = new ResizeCommand();
        composite.add(resize);
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}

package dp.command;

import dp.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    public List<Command> commandList;

    public CompositeCommand() {
        this.commandList=new ArrayList<>();
    }

    public void add(Command command) {
        this.commandList.add(command);
    }

    @Override
    public void execute() {
        for(Command command : commandList) {
            command.execute();
        }
    }
}

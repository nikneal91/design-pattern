package dp.template.exercise;

public class ChatWindow extends Window{


    @Override
    protected void preTasks() {
        System.out.println("Execute task before main close method!!");
    }

    @Override
    protected void postTasks() {
        System.out.println("Execute task after main close method!!");
    }
}

package dp.template.exercise;

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        preTasks();
        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
        postTasks();
    }

    protected abstract void preTasks() ;

    protected abstract void postTasks() ;
}

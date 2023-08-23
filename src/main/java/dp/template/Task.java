package dp.template;

public abstract class Task {

    private AuditTrail trail;

    public Task(AuditTrail trail) {
        this.trail = trail;
    }

    public void execute() {
        trail.record();
        doExecute();
    }

    protected abstract void doExecute();

}

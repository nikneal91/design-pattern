package dp.template;

public class TransferMoneyTask extends Task{

    public TransferMoneyTask(AuditTrail trail) {
        super(trail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Tranfer money task");
    }
}

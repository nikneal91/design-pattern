package dp.template;

public class GenerateReportTask extends Task{

    public GenerateReportTask(AuditTrail trail) {
        super(trail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }
}

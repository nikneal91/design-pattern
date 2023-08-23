package dp.template.main;

import dp.template.AuditTrail;
import dp.template.GenerateReportTask;
import dp.template.Task;
import dp.template.TransferMoneyTask;
import dp.template.exercise.ChatWindow;
import dp.template.exercise.Window;

public class Main {

    public static void main(String[] args) {
        //Transfer Money
        //Generate Report
        AuditTrail trail = new AuditTrail();
        Task task = new TransferMoneyTask(trail);
        Task task2 = new GenerateReportTask(trail);

        Window win = new ChatWindow();
        win.close();

    }
}

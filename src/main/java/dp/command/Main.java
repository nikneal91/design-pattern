package dp.command;

import dp.command.fx.Button;

public class Main {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button btn = new Button(command);
        btn.click();
    }
}

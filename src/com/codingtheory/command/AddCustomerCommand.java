package com.codingtheory.command;

import com.codingtheory.command.framework.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}

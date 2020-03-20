package com.codingtheory;

import com.codingtheory.command.AddCustomerCommand;
import com.codingtheory.command.CustomerService;
import com.codingtheory.command.framework.Button;

public class Main {

    public static void main(String[] args) {

       var service = new CustomerService();
       var command = new AddCustomerCommand(service);
       var button = new Button(command);
       button.click();
    }
}

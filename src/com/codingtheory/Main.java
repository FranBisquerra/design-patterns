package com.codingtheory;

import com.codingtheory.inheritance.CheckBox;
import com.codingtheory.inheritance.TextBox;
import com.codingtheory.inheritance.UIControl;
import com.codingtheory.interfaces.TaxCalculator;
import com.codingtheory.interfaces.TaxCalculator2019;

public class Main {

    public static void main(String[] args) {
        User user = new User("Mosh", 30);
        user.sayHello();

        var calculator = getCalculator();
        System.out.println("Taxes: " + calculator.calculateTax());

        var account = new Account();
        account.deposit(11);
        account.withdraw(5);
        System.out.println("Balance: " + account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();

        var textBox = new TextBox();
        textBox.enable();

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

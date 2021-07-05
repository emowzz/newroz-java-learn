package com.company;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

public class BankAccountTestParameterized {

    private BankAccount account;

    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.jupiter.api.BeforeEach()
    void setup() {
        account = new BankAccount("Fahim", "Foysal", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test");
    }


    private static Collection<Object[]> testConditions()
    {
        return Arrays.asList(new Object[][] {
        {100.00, true, 1100.00},
        {200.00, true, 1200.00},
        {325.00, true, 1325.00},
        {489.00, true, 1489.00},
        {1000.00, true, 2000.00}
    });
    }

    @org.junit.jupiter.api.Test
    public void deposit() throws Exception {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }

}

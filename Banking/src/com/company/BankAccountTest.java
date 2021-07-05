package com.company;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeAll
    public static void beforeClass()
    {
        System.out.println("This executes before any test cases"+count++);
    }


    //using beforeEach to run setup method before each test method
    @org.junit.jupiter.api.BeforeEach
    public void setup()
    {
        account = new BankAccount("Fahim", "Foysal", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.jupiter.api.Test()
    public void withdraw_notBranch() throws Exception {
//        double balance = account.withdraw(600.00, false);
//        assertEquals(400.00, balance, 0);
        account.withdraw(600.00, false);
//        fail("Should have thrown an IllegalArgumentException");


    }


    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking()
    {
        System.out.println(BankAccount.CHECKING);
        assertTrue(account.inChecking());
    }

    @org.junit.jupiter.api.AfterAll
    public static void afterClass()
    {
        System.out.println("This executes after any test cases"+count++);
    }

//    @org.junit.jupiter.api.AfterEach
//    public static void teardown()
//    {
//        System.out.println("Count = "+count++);
//    }

}


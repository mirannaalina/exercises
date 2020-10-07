package test;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class BankAccountTestParameterized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(BankAccount account, double amount, boolean branch, double expected) {
        this.account = account;
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        account =new BankAccount("Tim","Bac",1000.00,BankAccount.CHECHINGS);
        System.out.println("Running a test..");
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][]{
                { 100.00,true,1100.00 },
                {200.00, true, 1200.00},
                { 325.00 ,true, 1325.00},
                {1000.00,true, 2000.00}
        });
    }


    @org.junit.Test
    public void getBalance_deposit() throws Exception {

        account.deposit(amount,branch);
        assertEquals(expected, account.getBalance(),.01);
    }
}

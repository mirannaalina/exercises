package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {


    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("this executest before any test cases. Count = "+count++);
    }

    //is telling junit framework to run setup everytime is running a test
    //each time prior any method
    @org.junit.Before
    public void setup(){
        account = new BankAccount("tim","Bucka",1000.00,BankAccount.CHECHINGS);
        System.out.println("running a test");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount bankAccount = new BankAccount("Tim","Bucks",1000, BankAccount.CHECHINGS);
        double balance = bankAccount.deposit(200.00,true);
        assertEquals(1200.00,balance,1);//daca e exacta suma data, daca e 1, poate sa fie aproape
       // assertEquals(1200.00, bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00,true);
        assertEquals(400.00,balance,0);


    }

    @org.junit.Test//(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {

        //old way without expected illegal arg exception
        try{
            double balance = account.withdraw(600.00,false);

        }catch (IllegalArgumentException ex){

        }
       // double balance = account.withdraw(600.00,false);
       // assertEquals(400.00,balance,0);
    }



    //muswt be public and must be void, must be with @Test
    @org.junit.Test
    public void getBalance_deposit() throws Exception {
       // fail("this test has yet to be implemented");

        BankAccount bankAccount = new BankAccount("Tim","Bucks",1000,BankAccount.CHECHINGS);

      //  assertEquals(1200.00,balance,1);//daca e exacta suma data, daca e .01, poate sa fie aproape
        assertEquals(1000.00, bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {

        BankAccount bankAccount = new BankAccount("Tim","Bucks",600.00,BankAccount.CHECHINGS);
        bankAccount.withdraw(200.00,true);
        assertEquals(800.00, bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void dummyTest(){
        assertEquals(20,20); //valoarea asteptata prima, a doua valoarea actuala
    }


    @Test
    public void isChecking_true(){
       BankAccount account = new BankAccount("Tim","Bacc",1000.00, BankAccount.CHECHINGS);
       assertTrue("The account is not a checking account" , account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = "+count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("count = "+count++);
    }


}
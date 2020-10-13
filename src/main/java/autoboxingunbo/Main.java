package autoboxingunbo;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("BCR");
        bank.addBranch("Adelaire");
        bank.addCustomer("Adelaire","Tim",50.3);
        bank.addCustomer("Adelaire","Mike",30.0);
        bank.addCustomer("Adelaire","Percy",90.0);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","bob",150.00);
        bank.addCustomerTransaction("Adelaire","Tim",44.22);
        bank.addCustomerTransaction("Adelaire","Tim",400.22);
        bank.addCustomerTransaction("Adelaire","Mike",49.08);

        bank.listCustomer("Adelaire",true);
        bank.listCustomer("Sydney",true);





    }
}

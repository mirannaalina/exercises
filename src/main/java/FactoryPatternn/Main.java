package FactoryPatternn;


public class Main {

    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        PaymentMethod paymentMethod = factory.
                getPaymentMethod("net");
        paymentMethod.makePayment();
    }

     
}

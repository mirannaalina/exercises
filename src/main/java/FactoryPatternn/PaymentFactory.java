package FactoryPatternn;

public class PaymentFactory{


    public static PaymentMethod getPaymentMethod(String method){
        if ("creditcard".equalsIgnoreCase(method)) {
            return new CreditCard();
        } else if ("netbanking".equalsIgnoreCase(method)) {
            return new NetBanking();
        }
       throw  new IllegalArgumentException("not accepted");
    }
}

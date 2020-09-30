package LLambdaTop.ChallengeLambda;


import java.util.function.Supplier;

public class Lambda3 {

    public static void main(String[] args) {

        //Supplier<String> iLoveJava = () -> "I love Java";

        Supplier<String> iLoveJava = () -> {return "I love Java"; };

        String supplierResult = iLoveJava.get(); //with get takes the Supplier values
        System.out.println(supplierResult);

    }
}

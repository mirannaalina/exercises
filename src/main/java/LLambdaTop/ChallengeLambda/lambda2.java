package LLambdaTop.ChallengeLambda;

import java.util.function.Function;

public class lambda2 {

    public static void main(String[] args) {
        everySecondChar("12345678");

        //System.out.println(everySecondCharacter());

       // String result = everySecondCharacter(lambdaFunction, "234254252");
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnval = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnval.append(s.charAt(i));
                }
            }
            return returnval.toString();
        };


        return func.apply(source);
    }


    public static String everySecondChar(String source) {

        StringBuilder returnval = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnval.append(source.charAt(i));
            }
        }
        return returnval.toString();
    }
}





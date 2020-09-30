package LLambdaTop.ChallengeLambda;

import Threads.Runn;

public class LambdaExche {
    public static void main(String[] args) {

//anonymus
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }


            }
        };

        Runnable r1 = ()-> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

    }
}

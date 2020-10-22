package staticc;

public class Main {

    public static int multiplier= 7;

    public static void main(String[] args) {

//        StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName()+ " is instance number "+ StaticTest.getNumInstance());
//
//        StaticTest secondInstace =  new StaticTest("2nd instqance");
//        System.out.println(secondInstace.getName()+ " is instance number "+secondInstace.getNumInstance());
//
//        StaticTest thirdInstace =  new StaticTest("3xnd instqance");
//        System.out.println(secondInstace.getName()+ " is instance number "+thirdInstace.getNumInstance());

        int answer = multtiply(6);
        System.out.println(multiplier);
    }

    public static int multtiply(int number){
        return number*multiplier;
    }
}

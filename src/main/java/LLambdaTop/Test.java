package LLambdaTop;

public class Test implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String[] args) {

        FuncInterface fo = (int ss)->{
            System.out.println(2*ss);
        };

        fo.normalFun();


    }
}

package LLambdaTop;

@FunctionalInterface
public interface FuncInterface {

    void fun(int x);

    default void normalFun(){
        System.out.println("Hello");
    }
}

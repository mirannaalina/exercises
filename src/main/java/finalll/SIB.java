package finalll;

public class SIB {

    public static final String owner;

    //blocul static se va executa inaintea constructorului

    static{
        owner="tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIB(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void somemethod(){
        System.out.println("somemethod called");
    }
}

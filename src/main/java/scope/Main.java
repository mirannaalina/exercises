package scope;

public class Main {

    public static void main(String[] args) {


        String privateVar ="this is private to main";
        ScopeCheck scopeInstance = new ScopeCheck();

        System.out.println("scopeInstance privateVar is "+ scopeInstance.getS());
        System.out.println(privateVar);


        System.out.println("scopeInstance privateVar is "+ scopeInstance.getPrivateVar());



    }
}

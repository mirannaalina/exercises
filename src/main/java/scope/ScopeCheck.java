package scope;

public class ScopeCheck {

    public int s =0;
    private int privateVar =1;

    public ScopeCheck() {
      //  System.out.println("ScopeCheck created, s"+ s+" : private var "+ privateVar);
    }

    public int getS() {
        return s;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}

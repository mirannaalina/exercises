package scope;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class ScopeCheck {

    public int s =0;
    private int privateVar =1;

    public ScopeCheck() {
      //  System.out.println("ScopeCheck created, s"+ s+" : private var "+ privateVar);
    }

    public void useInner(){
        //InnerClass innerClass=  new InnerClass("s",2);

    }

    public int getS() {
        return s;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}

package staticc;

public class StaticTest {


    // private int numInstance=0;
    private  static int numInstance =0;
    private String name;

    public StaticTest(String name) {
        numInstance++;
        this.name = name;
    }

    public static int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }
}

package finalll;

public class SomeClass {

    private static int classCounter=0;
    public final int instaneceNr;
    private final String name;

    public SomeClass(String name) {
        this.name= name;
        classCounter++;
        instaneceNr=classCounter;

        System.out.println("test"+ classCounter);

    }
}

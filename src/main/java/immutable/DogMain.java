package immutable;

public class DogMain {

    public static void main(String[] args) {

        Labrador rove = new Labrador("Rove");
        Dog rove2 = new Dog("Rove");


        System.out.println(rove2.equals(rove));
        System.out.println(rove.equals(rove2));
    }
}

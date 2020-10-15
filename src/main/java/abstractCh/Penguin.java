package abstractCh;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void Fly() {
        super.Fly();
        System.out.println("test");
    }
}

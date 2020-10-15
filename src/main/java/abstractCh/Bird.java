package abstractCh;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void breath() {

    }

    public abstract void fly();



}

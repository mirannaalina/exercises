package abstractCh;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void breath() {

    }

    @Override
    public void Fly() {
        System.out.println(getName()+ " Flapping its ");
    }
}

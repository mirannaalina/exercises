package abstractCh;

public class Main {

    public static void main(String[] args) {

        Dog  dog = new Dog("York");
        dog.breath();
        dog.eat();


        Parrot bird= new Parrot("PArr");
        bird.breath();
        bird.eat();
        bird.Fly();

        Penguin peng = new Penguin("Emperor");
        peng.Fly();
    }
}

package SingletonPattern;

public class Singlet {

  private   Singlet instance = null;

    private Singlet(){
    }

    public Singlet getInstance(){
        if(instance==null){
            instance = new Singlet();
        }
        return instance;
    }
}

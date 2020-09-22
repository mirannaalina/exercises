package trenEx;

public class CalatoriB extends Vagon {

    @Override
    public void deschidereUsi() {
        System.out.println("Usile automate se deschid pt calatori B");
    }

    @Override
    public void inchidereUsi() {
        System.out.println("Usile automate se inchid pt calatori B");
    }

   public void blocareGeamuri(){
       System.out.println("Geamurile se blocheaza pt calatori B");
   }
}


package innerC;

public class Main {

    public static void main(String[] args) {
        GearBox mcLAren=  new GearBox(6);
        GearBox.Gear first = mcLAren.new Gear(1,2.3);
       //GearBox.Gear second = new mcLAren.Gear()
        System.out.println(first.driveSpeed(1000));

        mcLAren.changeGear(1);
    }
}

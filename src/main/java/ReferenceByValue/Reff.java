package ReferenceByValue;

public class Reff {

    public static void main(String[] args) {
        Reff referinta  = new Reff();

        int value=3;

        metoda(referinta);
        metoda2(value);

        String mama = new String ("sss");
        String a = "mama";

        metoda3(a);
        metoda3(mama);
    }


    public static void metoda(Reff referintaParametru){

    }

    public  static void metoda2(int valuereferinta){

    }

    public static void metoda3(String sref){

    }




}

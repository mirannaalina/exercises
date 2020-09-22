package trenEx;

import java.util.Comparator;
import java.util.Vector;
import java.lang.Integer;

public class Main{

   static Vagon calatoria = new CalatoriA() ;
   static Vagon calatorib = new CalatoriB();
   static  Vagon marfa = new Marfa();

    public static void main(String[] args) {

        Tren tren = new Tren();

        Vector v = new Vector();
        v.add(calatoria);
        v.add(calatorib);
        v.add(marfa);

        System.out.println(trenuriEgale());

    }

    public static String trenuriEgale() {

        if(calatoria.getColete()==calatorib.getColete())
        return "trenurile sunt egale";
        else{
          return "trenurile nu sunt egale";
        }
    }



}

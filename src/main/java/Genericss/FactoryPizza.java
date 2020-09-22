package Genericss;

public class FactoryPizza {

   public Pizza getPizza(String pizz) {
       if("hampizza".equalsIgnoreCase(pizz)){
           new HamPizza();
       }else if("cheezepizza".equalsIgnoreCase(pizz)){
           new ChezzePizza();
       }else if("pizza".equalsIgnoreCase(pizz)){
           new HamPizza();
       }
       //throw  new IllegalArgumentException("not accepted this pizza");
       return null;
   }
}

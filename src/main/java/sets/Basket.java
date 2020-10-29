package sets;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public static void main(String[] args) {

        Basket b = new Basket("hey");
        b.list.put(new StockItem("Bag",2.4), 3);
        b.list.put(new StockItem("Bagies",2.4), 8);
        
        System.out.println(b.list);
    }
}

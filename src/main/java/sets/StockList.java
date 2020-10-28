package sets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item){
        if(item != null){
            StockItem inStock = list.getOrDefault(item.getName(),item);
            if(inStock!=item){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(),item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item,null);

                if((inStock!=null) && (inStock.getQuantityStock()>=quantity)&&quantity>0){
            inStock.adjustStock(-quantity);
            return quantity;
                }
                return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }
}

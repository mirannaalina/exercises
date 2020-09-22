package LLambdaTop;

import java.util.Comparator;

public class Product {

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//    public static Comparator
//       ascendingPrice = (p1,p2) -> {
//        return p1.getPrice() -p2.getPrice();
//    };


}

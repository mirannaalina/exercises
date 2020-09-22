package shapeEx;

public abstract class Shape {

    String color;
    boolean filled;
    double area=3.14 * 14 *14;
    double perimeter= 2 * area;

    public Shape(){}

    public Shape(String color, boolean filled){}

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

   public double getArea(){
        return area;
   }
   public double getPerimeter(){
       return perimeter;
   }



}

//Shape is the abstract class
//If a class contains more than one abstract method, the class has be to declared as an abstract class
// Abstract class can be inherited
public abstract  class Shape {
    String color;
    //Abstract class can have constructors

    Shape(){
        this.color = "";
    }

    Shape(String color){
        this.color = color;
    }
    //Abstract class can have concrete methods (Defined methods)- Methods you know what they do

    public void display(){
        IO.println("Color is: "+ this.color);
    }
    //Area of Rectangle = L x w
    //Area of Circle = PI x (radius)^2

    //calc_area is an abstract method, abstract goes between access modifer and return type
    //Abstract method doesn't have any definition/implementation in the abstract class
    //calc_Area is defined
    public abstract void calc_Area();
    //Abstract

}

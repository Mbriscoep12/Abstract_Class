public class Circle extends Shape {
//if a class inherits an abstract class, the subclass/base must have to provide definition of the inheirted abstract method

    double radius;
    Circle(){
        //this.color="";
        super();
        this.radius = 0;
    }

    Circle(String color, double radius){
        //this.color = color;
        super(color);
        this.radius = radius;
    }
    @Override
    public void calc_Area() {
        double area = 3.1415 * this.radius * this.radius;
        IO.println("Circle area: "+ area);
    }
}

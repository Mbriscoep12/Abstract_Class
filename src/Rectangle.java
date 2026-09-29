public class Rectangle extends Shape {

    double Length;
    double Width;

    Rectangle(){
        super();
        this.Length = 0;
        this.Width = 0;
    }

    Rectangle(String color, double length, double width){
        super(color);
        this.Length = length;
        this.Width = width;
    }

    @Override
    public void calc_Area() {
        double area = this.Length * this.Width;
        IO.print("Rectangle area: "+ area);

    }
}

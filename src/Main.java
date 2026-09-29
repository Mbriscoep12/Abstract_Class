void main() {
    //Holds reference
    Shape s1;

    //You CAN NOT create object for abstract class
    //s1 = new Shape();

    s1 = new Circle("Black", 30.5);

    Shape s2 = new Rectangle("Gold", 20, 25);

    Shape [] shapes = new Shape[2];
    shapes[0] = s1;
    shapes[1] = s2;

    for(Shape sh: shapes){
        sh.calc_Area();
    }

}

class Circle {

    //attributes x, y and radius
    double x, y;
    double d;

    //Constructor for circle
    public Circle (double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.d = diameter;
    }
}
                    //refactored r to d


class TestCircle {
    public static void main (String[] args) {
        //set circle parameters
        Circle c = new Circle(1.24, 2.83, 25.4);

        //print x and y coordinates and radius
        System.out.println("x="+c.x+" y="+c.y+" d="+c.d);

        //multiply radius by 1.37
        c.d *= 1.37;

        //multiply x by 0,65
        c.x += 0.65;

        //print the new values
        System.out.println("x="+c.x+" y="+c.y+" d="+c.d);
    }
}


class Circle {

    //attributes x, y and radius
    double x, y;
    double r;

    //Constructor for circle
    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.r = radius;
    }
}



class TestCircle {
    public static void main (String[] args) {
        //set circle parameters
        Circle c = new Circle(1.24, 2.83, 12.7);

        //print x and y coordinates and radius
        System.out.println("x="+c.x+" y="+c.y+" r="+c.r);

        //multiply radius by 1.37
        c.r *= 1.37;

        //multiply x by 0,65
        c.x += 0.65;

        //print the new values
        System.out.println("x="+c.x+" y="+c.y+" r="+c.r);
    }
}


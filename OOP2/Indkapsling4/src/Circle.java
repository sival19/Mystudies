class Circle {

    //attributes x, y and radius
    private double x, y;
    private double d;

    //make getters


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getD() {
        return d;
    }

    //make setters


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setD(double d) {
        this.d = d;
    }

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
        Circle c = new Circle(2.5, 3.5, 11.5);

        //print x and y coordinates and radius
        System.out.println("x="+c.getX()+" y="+c.getY()+" d="+c.getD());

        //multiply radius by 1.37
        c.setD(c.getD()*1.37);

        //multiply x by 0,65
        c.setX(c.getX()+0.65);

        //print the new values
        System.out.println("x="+c.getX()+" y="+c.getY()+" d="+c.getD());
    }
}


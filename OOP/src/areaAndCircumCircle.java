public class areaAndCircumCircle {

    //make method for area and circum of circle

    public static void areaAndCircle (double radius) {         //radius
        System.out.println("The area of circle with radius of: " +radius + " is: " +
                (radius*radius*Math.PI)); //print area of circle
        System.out.println("The circum of circle with radius of: " + radius + " is: " +
                (2*radius*Math.PI));       //print circum of circle
        System.out.println();
    }

    public static void main(String[] args) {

        //call areaAndCircle method
        areaAndCircle(1);
        areaAndCircle(3);
        areaAndCircle(5);
    }
}

public class areaOfCircles {
    public static void main(String[] args) {
        //set circle areas in an array
        byte[] circleAreas = {1, 3, 5};
        //set a for loop to run arrays duration while adding 1
        for (byte circleArea : circleAreas) {
            //print the area of circles (r*r*pi)
            System.out.println("The area of circle with radius: " + circleArea + " is: " + (circleArea * +
                    circleArea * Math.PI));
        }

    }
}

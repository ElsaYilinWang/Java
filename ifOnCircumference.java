public class ifOnCircumference {
    //This method is to test if a given point (a, b) is outside/on/inside the circle
    //with radius r.

    public static void if_On_Circumference(double a, double b, double r){


        double distance_to_origin = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));
        // the distance between point(a, b) to the origin (0, 0)

        if (distance_to_origin < r){

            System.out.println("The point is inside of the circle!");

        } else if (distance_to_origin == r){

            System.out.println("The point is on the circle!");

        } else {

            System.out.println("The point is outside the circle!");
        }
    }



    public static void main(String[] args){

        if_On_Circumference(2, -2, 3);
        //The given point is (2, -2) and the circle has a radius of 3.

    }
}
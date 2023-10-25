public class FirstClass {
    public static void main(String[] args) {
        //Create a double variable with a value of 20.00
        double firstVariable = 20.00d;
        System.out.println("Step1: first variable is " + firstVariable);

        //Create a second variable of type double with a value 80.00
        double secondVariable = 80.00d;
        System.out.println("Step2: Second variable is " + secondVariable);

        // Add both together, then multiply by 100.00
        double addBoth = (firstVariable + secondVariable) * 100.00;
        System.out.println("Step3: add both and multiply by 100.00 is " + addBoth);

        // Find the remainder of addBoth and 40.00
        double findRemainder = addBoth % 40.00;
        System.out.println("Step4: the remainder of add both and 40.00 is " + findRemainder);

        // Create a boolean value, true if findRemainder == 0.00, false if findRemainder != 0.00
        boolean remainderIsZero;
        if (findRemainder == 0.00){
            remainderIsZero = true;
        } else {
            remainderIsZero = false;
            //Display a message "got some remainder" if remainderIsZero is not true.
            System.out.println("Got some remainder! XD");
        }
        //Output the boolean variable
        System.out.println("The boolean variable is " + remainderIsZero);




    }
}

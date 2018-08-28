/*
* This program displays numbers
* with leading zeros
*/

public class LeadingZeros {

    public static void main(String args[]) {
        // declare a variety of double variables
        double number1 = 1.234;
        double number2 = 12.345;
        double number13 = 123.456;

        //Display each variable leading zeros,
        //in a field of 9 spaces, rounded to
        // 2 decimal places
        System.out.printf("%09.2f\n", number1);
        System.out.printf("%09.2f\n", number2);
        System.out.printf("%09.2f\n", number3);
    }
}

/**
 * Chapter 2
 * Programming Challenge 1: Name, Age, and Annual Income
 */

public class NameAgeAnnualIncome
{
   public static void main(String[] args)
   {
      String name;         // To hold a name
      int age;             // To hold an age
      double annualPay;    // To hold annualPay

      // Store values in the variables.
      name = "Joe Mahoney";
      age = 26;
      annualPay = 100000.0;

      // Display a message.
      System.out.println("My name is " + name +
                         ", my age is " + age +
                         " and \nI hope to earn $" +
                         annualPay + " per year.");
   }
}

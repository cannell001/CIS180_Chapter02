/**
 * Chapter 2
 * Programming Challenge 2: Name and Initials
 */

public class NameAndInitials
{
   public static void main(String[] args)
   {
      String firstName = "Herbert";    // First name
      String middleName = "George";    // Middle name
      String lastName = "Dorfmann";    // Last name

      char firstInitial;               // To hold the first initial
      char middleInitial;              // To hold the middle initial
      char lastInitial;                // To hold the last initial

      // Get the first character of each string.
      // These will be the initials.
      firstInitial = firstName.charAt(0);
      middleInitial = middleName.charAt(0);
      lastInitial = lastName.charAt(0);

      // Display the contents of the variables.
      System.out.println("Name: " + firstName +
                         " " + middleName + " " +
                         lastName);
      System.out.println("Initials: " + firstInitial +
                         middleInitial + lastInitial);
   }
}

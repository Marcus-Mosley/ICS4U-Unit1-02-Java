import java.util.Scanner;

/**
* The LoggingTrucks program implements an application that
* determines the amount of logs that can fit on a logging truck.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-20 
*/
public class LoggingTrucks {
  /**
  * The LoggingTrucks program implements an application that
  * determines the amount of logs that can fit on a logging truck.
  */
  public static void main(String[] args) {
    // Input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of the logs (m): ");
    float length = input.nextFloat();

    // Process
    float logs = 1100 / (20 * length);

    // Output
    System.out.printf("The truck can hold %.0f logs.", new Object[] {logs});
  }
}

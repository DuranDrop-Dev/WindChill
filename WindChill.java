// DuranDrop-Dev

import java.util.Scanner;

public class WindChill {
  public WindChill() {
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the temperature in Fahrenheit as a double: ");
    double fahrenheit = input.nextDouble();
    if (fahrenheit < -58.0 || fahrenheit > 41.0) {
      System.out.println("Temperature must be between -58 degrees F and 41 degrees F");
      System.exit(1);
    }

    System.out.print("Enter the wind speed miles per hour as a double: ");
    double speed = input.nextDouble();
    if (speed < 2.0) {
      System.out.println("Speed must be greater than or equal to 2");
      System.exit(1);
    }

    double windChillIndex = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(speed, 0.16) + 0.4275 * fahrenheit * Math.pow(speed, 0.16);
    System.out.println("The wind chill index is " + windChillIndex);
  }
}

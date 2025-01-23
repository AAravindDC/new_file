import java.util.*;
// Name: Aravind Arampu
// Program Name: inClassAssignment1
// Program description: This program will convert two units of measurements

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Declare variables for the program
       double distance;
       double fahrenheit;
       double mass;
       double celcius;

       //Prompt user to enter distance in KM and then convert and print to meters
       System.out.println("Please enter the distance in km you would like to convert to meters");
       distance= input.nextDouble();
       System.out.printf(distance + " KM converted to meters is %.0fm\n",(distance*1000));

       //Prompt user to enter tempreture in fahrenheit and then convert and print to celcius
       System.out.println("\nPlease enter the tempreture in fahrenheit you would like to convert to celcius");
       fahrenheit= input.nextDouble();
       celcius = (fahrenheit - 32)*5 / 9;
       System.out.printf("%.0f°F converted to celcius is %.0f°C\n",fahrenheit,celcius);

       //Prompt user to enter mass in kilogram and then covert and print to grams
       System.out.println("\nPlease enter the mass in KG you would like to convert to Grams");
       mass= input.nextDouble();
       System.out.printf(mass + "Kg converted to grams is %.0fg",(mass*1000));
    }
}
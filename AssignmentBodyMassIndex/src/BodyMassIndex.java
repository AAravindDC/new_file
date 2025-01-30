// Name: Aravind Arampu
// Program Name: BodyMassIndex
// Program description: This program will convert two units of measurements
//Date: Jan 30 2025
import java.util.*;
public class BodyMassIndex {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        double mass;
        double height;
        final double CONVERSION_FACTOR = 703;
        boolean condition1 = false ;
        boolean condition2 = false;

    System.out.println("Please enter your weight in pounds");
    do {
        mass = input.nextDouble();
        if (mass>=25){
            condition1 =true;
            }
        else {
            System.out.println("Invalid number entered");
            System.out.println("Please enter your weight in pound with a minimum value of 25");
            }
    } while (condition1 == false);

    System.out.println("Please enter your height in inches");
    do {
        height = input.nextDouble();
        if (height>=24 && height<=120){
            condition2 =true;
        }
        else{
            System.out.println("Invalid number entered");
            System.out.println("Please enter your height in inches in the range of 24” to 120”");
        }
    } while (condition2 == false);

    double bmi = (mass/(height*height))*CONVERSION_FACTOR;
        System.out.println(bmi);

        if (bmi < 16){
            System.out.printf("Your BMI is %.1f, which is considered severely underweight",bmi);
        }
        else if (bmi >= 16 && bmi < 18.5){
            System.out.printf("Your BMI is %.1f, which is considered underweight",bmi);
        }
        else if  (bmi >= 18.5 && bmi < 25){
            System.out.printf("Your BMI is %.1f, which is considered healthy",bmi);
        }
        else if  (bmi >= 25 && bmi < 30){
            System.out.printf("Your BMI is %.1f, which is considered overweight",bmi);
        }
        else if (bmi >= 30){
            System.out.printf("Your BMI is %.1f, which is considered obese",bmi);
        }

    }

}

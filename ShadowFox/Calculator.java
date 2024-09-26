package shadow.fox;

import java.util.*;
import java.lang.Math;

public class Calculator {

    public static void arithmetic_operations() {

        System.out.println("1.ADD" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        switch (a) {
            case 1: {
                System.out.println("enter the first number");
                int n1 = sc.nextInt();
                System.out.println("enter the second number");
                int n2 = sc.nextInt();
                System.out.println("The Answer is " + (n1 + n2));
                break;
            }
            case 2: {
                System.out.println("enter the first number");
                int n1 = sc.nextInt();
                System.out.println("enter the second number");
                int n2 = sc.nextInt();
                System.out.println("The Answer is " + (n1 - n2));
                break;
            }
            case 3: {
                System.out.println("enter the first number");
                int n1 = sc.nextInt();
                System.out.println("enter the second number");
                int n2 = sc.nextInt();
                System.out.println("The Answer is " + (n1 * n2));
                break;
            }
            case 4: {
                System.out.println("enter the first number");
                int n1 = sc.nextInt();
                System.out.println("enter the second number");
                int n2 = sc.nextInt();
                System.out.println("The Answer is " + (n1 / n2));
                break;
            }

        }
    }
    

    public static void scientific_calculations() {
        System.out.println("1.Square Root" + "\n" + "2.Square" + "\n" + "3.Exponential" + "\n" + "4.Cube Root" + "\n" + "5.Cube" + "\n" + "6 sin" + "\n" + "7.cos" + "\n" + "8.tan" + "\n" + "9.log");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.sqrt(n1));
                break;
            }
            case 2: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + n1 * n1);
                break;
            }
            case 3: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.exp(n1));
                break;
            }
            case 4: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.cbrt(n1));
                break;
            }
            case 5: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + n1 * n1 * n1);
                break;
            }
            case 6: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.sin(n1));
                break;
            }
            case 7: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.cos(n1));
                break;
            }
            case 8: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.tan(n1));
                break;
            }
            case 9: {
                System.out.println("enter the number");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + Math.log(n1));
                break;
            }

        }
    }

    public static void unit_conversion() {
        System.out.println("1.Meter to KiloMeter" + "\n" + "2.Kilometer to Meter" + "\n" + "3.Meter to Centimeter" + "\n" + "4.Centimeter to Meter" + "\n" + "5.Celsius to Farhaneit" + "\n" + "6.Farhaneit to Celsius" + "\n" + "7.Centimeters to Inches" + "\n" + "8.Inches to Centimeters");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        
        switch (b) {
            case 1: {
                System.out.println("Enter the meters");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + (n1 / 1000) + " kilometers");
                break;
            }
            case 2: {
                System.out.println("Enter the Kilometers");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + (n1 * 1000) + " meters");
                break;
            }
            case 3: {
                System.out.println("Enter the Meters");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + (n1 * 100) + " centimeters");
                break;
            }
            case 4: {
                System.out.println("Enter the Centimeters");
                int n1 = sc.nextInt();
                System.out.println("The Answer is " + (n1 / 100) + " meters");
                break;
            }
            case 5: {
                System.out.println("Enter the Celsius");
                double n1 = sc.nextDouble();
                System.out.println("The Answer is " + ((n1 * 9 / 5) + 32) + " Farhaneits");
                break;
            }
            case 6: {
                System.out.println("Enter the Farhaneits");
                double n1 = sc.nextDouble();
                System.out.println("The Answer is " + ((n1 - 32) * 5 / 9) + " Celsius");
                break;
            }
            case 7: {
                System.out.println("Enter the Centimeters");
                double n1 = sc.nextDouble();
                System.out.println("The Answer is " + (n1 * 0.393701) + " Inches");
                break;
            }
            case 8: {
                System.out.println("Enter the Inches");
                double n1 = sc.nextDouble();
                System.out.println("The Answer is " + (n1 / 0.393701) + " Centimeters");
                break;
            }
            

        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************** CALCULATOR*************");
        System.out.println("Choose The Operation:");
        System.out.println("1.Arithmetic Operation" + '\n' + "2.Scientific Calculations" + "\n" + "3.Unit Conversions" + "\n"+"4.Exit" );
        int x = sc.nextInt();

        switch (x) {
            case 1: {
                arithmetic_operations();
                break;
            }
            case 2: {
                scientific_calculations();
                break;
            }
            case 3: {
                unit_conversion();
                break;
            }
            case 4:{
                System.exit(0);
            }

        }
    }
}

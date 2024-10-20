package Task.ex_18_oct;

import java.util.Scanner;

public class Ferenite_celcius {
    public static void main(String[] args) {
//        Write a program that converts between different units
//        (e.g., kilometers to miles, Celsius to Fahrenheit)
//        based on user selection using a switch statement.
//                Input. -
//                choice - 1 - km → m, km → 1km
//        choice - 2 - f → c, f → c

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice--- are you convert to 'kilometers to miles' or 'Celsius to Fahrenheit'?");
        byte choice= input.nextByte();
        switch (choice){
            case 1:{
                System.out.println("Enter the distance in km to convert that into miles");
                double distance= input.nextDouble();
                double miles= distance * 0.621371;
                System.out.printf("Your distance is converted to miles....\n");
                System.out.printf("%f km is equal to %f miles",distance,miles);
                break;
            }
            case 2:{
                System.out.println("Enter the Temparature in Fahrenheit to convert that into Celsius");
                double temp= input.nextDouble();
                double c = ((temp - 32)*5/9);
                System.out.printf("%f ferehnite is equal to %f celsius",temp,c);
                break;
            }
            default:
                System.out.println("please select your choice from 1 0r 2 number");
        }
        input.close();


    }
}

package Labs;

import java.util.Scanner;

public class Lab1_F_to_C_temp {
    public static void main(String[] args){
        String City = "hello ";
        double Num_Fahrenheit = 0.0;
        double Num_Celsius = 0.0;

        System.out.println("welcome to Fahrenheit to Celsius Calculator" );
        System.out.println("what is the city you live in ?" );
        Scanner city_answer   = new Scanner(System.in);
         City = city_answer.nextLine();

        System.out.println("what is the temp (in Fahrenheit) in your city ?" );
        Scanner Fahrenheit_answer   = new Scanner(System.in);
        Num_Fahrenheit = Fahrenheit_answer.nextDouble();
        Num_Celsius = (Num_Fahrenheit - 32) * .5555;

        System.out.println("the temp in "+City+" is "+Num_Celsius+" Celsius " );












    }
}

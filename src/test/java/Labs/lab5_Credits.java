package Labs;

import week_2.myMethods;

import java.io.IOException;
import java.util.Scanner;

//Lab #5b Name:franco orantes
public class lab5_Credits extends myMethods {

    public static void main(String[] args) throws IOException {
        int credits_cost ;
        int fasa_duc ;

        Scanner user_info = new Scanner(System.in);


        System.out.println(" enter  the number of credits your are taking next semester?");
        credits_cost = user_info.nextInt();
        credits_cost = getNumCredits(credits_cost);
        System.out.println(" Your estimated tuition is $" + credits_cost);


        System.out.println(" how much do you have in financial aid?");
        fasa_duc = user_info.nextInt();
        fasa_duc = getNumFasfa(fasa_duc,credits_cost);
        System.out.println(" Your estimated tuition with financial aid is $"+fasa_duc);


        System.out.println("printing file ... Done");
        System.out.println("have a great day bye - fox_program");
        runPrint(fasa_duc);
    }
}

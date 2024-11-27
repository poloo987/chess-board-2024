package week_2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class cheatSheet {

    static String Answer ;
    public static void main(String[] args){
        int dice4 = 1;
        int food = 0;
        String char_to_num= "100";
        final int BAGFEE = 50;

        // parseInt ++++++++++++++++++++++++++
        food = Integer.parseInt(char_to_num);
        // SCANNER ++++++++++++++++++++++++++++++++++++++++++++++++++
     Scanner User_answer   = new Scanner(System.in);
        System.out.println("what your name ?");
        Answer = User_answer.nextLine();
        System.out.println(Answer);
        // JOptionPane +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        JOptionPane.showMessageDialog(null, "texts");
        JOptionPane.showInputDialog(null, "Enter your first name");

       // Answer.equalsIgnoreCase("Normal");

        // JOptionPane +++++++++++++++++++

        Random rand1 = new Random();
        dice4 = rand1.nextInt(3);

        // SWITCH ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        switch (dice4) {
            case 0:
                System.out.println("1");
                food = 1;

                break;
            case 1://|Bishop_|
                System.out.println("2");
                food = 2;

                break;
            case 2://|_Queen_|
                System.out.println("3");
                food = 2;
                break;
        }// @@@@@@@@ in IF  condtion -->and = && , or = || , not = ! @@@
        // IF ELSE ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        if (food == 5 ) {
            System.out.println("no meat");
        }else{
             System.out.println("no meat");}
        //NESTED IF ELSE +++++++++++++++++++++++++++++++++++
            if (food ==1 ) {
                System.out.println("no meat");
            } else if (food ==2 ) {
                System.out.println("give meat");
        }else if (food ==3 ) {
                System.out.println("give meat");
            }

            //LOOPS ++++++++++++++++++++++++++++++++++++++++++++++++++++
            //for loop
        for(int i = 0; i < dice4; i++) {
            System.out.println("@@@");
        }
            // nested for loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // i Executes 2 times
                // Inner loop
                for (int j = 1; j <= 3; j++) {
                    System.out.println(" Inner: " + j); // j Executes  6 times (2 * 3)
                }
        }
        // while and do while
        while(food ==4 ) {
            System.out.println("print");
        }

        do {
            System.out.println("print");
        } while(food ==4 );

        //Local_method +++++++++++++++++++++++++++++++++++++++++++++++++++
        int pizza = getLocal_method(food, dice4);

    }// end of main method
    public static int getLocal_method(int food, int dice4) {

        int  pizza_fix = food - dice4;

        return pizza_fix;
    }
    // ++++++++++++++++++++++++++++++++++++++++++Local_method
}


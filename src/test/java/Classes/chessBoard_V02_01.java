package Classes;
//Requirement 1 – IPO
// Input: they give answers to the tutorial questions these are board coordinates and yes or no answers
// process: takes answer check if correct. if so pass on to next question .else ask to start over
// Output: she responds to answers


import pages.Tut_questions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class chessBoard_V02_01 {
    public static void main(String[] args){

        //Welcome the user using a dialog box //Requirement 3
        JOptionPane.showMessageDialog(null, "welcome to Co-op Chess Board_V02_01");
        JOptionPane.showMessageDialog(null, "welcome to the tutorial let's learn how to set up the board");

        // set up user for Co-op Chess Board tutorial
        System.out.println("a chess board's piece are set up from left right like this:" );
        System.out.println("this is for the black piece (black always goes first) " );
        System.out.println("||+++0+++||===A===||===B===||===C===||===D===||===E===||===F===||===G===||===H===||+++0+++||" );
        System.out.println("||===1===||_Rook__||Knight_||Bishop_||_Queen_||_King__||Bishop_||Knight_||_Rook__||+++0+++||" );
        System.out.println("use the board coordinates to answer ex: C1 or F1 " );// could improve by including a  fail-safe to make answer always upper case

        // may use for V03
        //System.out.println("||+++++||==A==||==B==||==C==||==D==||==E==||==F==||==G==||==H==||+++++||" );
        //System.out.println("||==1==||-----||-----||-----||-----||-----||-----||-----||-----||+++++||" );

// =================================================code ===============================================================

        int dice = 2; //for testing
        int reRollNum = 0; //Requirement 5 - mathematical calculation: addition - line 55
        int countDown = 5; //Requirement 5 - mathematical calculation: subtraction - line 60
        final int THE_FINAL_COUNT_DOWN = 0;//Requirement 2 – constant

        Tut_questions getQA = new Tut_questions();// //Requirement 7 - Outputs (formatted cleanly) - see Tut_questions.java
        Random rand1 = new Random();// Requirement 6 - random number gen. - line 45

        ArrayList<String> checkLineUp = new ArrayList< >(Arrays.asList()); // <------Requirement 9 - ArrayList !!!!!!!!!!!!

        do {
            dice = rand1.nextInt(5); // rolling dice // Requirement 6
            ArrayList<String> lineUp = new ArrayList< >(Arrays.asList("Rook","Knight","Bishop","Queen","King"));

            /* ==for testing ==
            System.out.println(lineUp.get(dice));
            System.out.println(checkLineUp.get(checkLineUp.size() - 1));
            System.out.println(dice);
            */

            //Requirement 4 - if/else FYI every class called in this program has nested if/else
            if(checkLineUp.contains(lineUp.get(dice))){
              reRollNum = reRollNum + 1; //Requirement 5
              // |==for testing == |System.out.println("rerolling dice ");
            }else{
                checkLineUp.add(lineUp.get(dice));
                countDown = countDown - 1; //Requirement 5 <------Requirement 8 -You must comment every requirement on list


        switch (dice) {
            case 0: //|_Rook__| pass 9/19/24
                getQA.rook_QA();// <------Requirement 9 - OOP & Inheritance !!!!!!!!!!!!
                break;
            case 1://|Knight_|pass 9/19/24
                getQA.knights_QA();// <------Requirement 9 - OOP & Inheritance !!!!!!!!!!!!
                break;
            case 2://|Bishop_| pass 9/19/24
                getQA.bishops_QA();// <------Requirement 9 - OOP & Inheritance !!!!!!!!!!!!
                break;
            case 3://|_Queen_| pass 9/19/24
                getQA.queen_QA();// <------Requirement 9 - OOP & Inheritance !!!!!!!!!!!!
                break;
            case 4://|_King__| pass 9/19/24
                getQA.king_QA();// <------Requirement 9 - OOP & Inheritance !!!!!!!!!!!!
                break;
        }
               /* ==for testing ==
                System.out.println(dice);
                System.out.println(lineUp.get(dice));
                */
            }
        }while (countDown != THE_FINAL_COUNT_DOWN);

        JOptionPane.showConfirmDialog(null, "Fox_AI - did you have fun ?", "Fox_AI -01", JOptionPane.YES_NO_OPTION); //Requirement 10 -  confirm box
        if (JOptionPane.YES_NO_OPTION == 0){
            System.out.println("Fox_AI - I am so happy to hear that ! *(^o^)*");
            System.out.println("rerolling dice kill count  "+reRollNum);
        }else {
            System.out.println("Fox_AI - I am so sorry to hear that I will do better next time ! (>_<)(;_;)");
            System.out.println("rerolling dice kill count  "+reRollNum);
        }
    }
}


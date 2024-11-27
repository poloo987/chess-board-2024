package Classes;
import java.util.Scanner;
public class chessBoard_V01 {
    public static void main(String[] args){
       // Scanner city_answer   = new Scanner(System.in);
       // City = city_answer.nextLine();
        // random might help with the question set up
       /* String Rook_01 = "Rook";
        String Knight_01 = "Knight";
        String Bishop_01 = "Bishop";
        String King = "King";
        String Queen = "Queen ";
        String Bishop_02 = "Bishop";
        String Knight_02 = "Knight";
        String Rook_02 = "Rook";
        String Pawn = "Pawn";
        //System.out.println("||+++0+++||===A===||===B===||===C===||===D===||===E===||===F===||===G===||===H===||+++0+++||" );
        //System.out.println("||===1===||_Rook__||Knight_||Bishop_||_Queen_||_King__||Bishop_||Knight_||_Rook__||+++0+++||" );
        //System.out.println("||===2===||_Pawn__||_Pawn__||_Pawn__||_Pawn__||_Pawn__||_Pawn__||_Pawn__||_Pawn__||+++0+++||" );
        */
        String Answer ;
        String pastAnswer ;
        String continue_answer = "no";
        Scanner User_answer   = new Scanner(System.in);
        Scanner continue_scan   = new Scanner(System.in);

        System.out.println("welcome to Co-op Chess Board_V01" );
        System.out.println("welcome to the tutorial let learn how to set up the board " );
        System.out.println("a chess board's piece are set up from left right like this:" );
        System.out.println("this is for the black piece (black always goes first) " );

        System.out.println("||+++0+++||===A===||===B===||===C===||===D===||===E===||===F===||===G===||===H===||+++0+++||" );
        System.out.println("||===1===||_Rook__||Knight_||Bishop_||_Queen_||_King__||Bishop_||Knight_||_Rook__||+++0+++||" );


        System.out.println("||+++++||==A==||==B==||==C==||==D==||==E==||==F==||==G==||==H==||+++++||" );
        System.out.println("||==1==||-----||-----||-----||-----||-----||-----||-----||-----||+++++||" );

        System.out.println("use the board cordantes to answer ex: C1 or F1 " );


// =================================================rooks===============================================================
        do{
            System.out.println("where do the rooks go? " );
            Answer = User_answer.nextLine();
            if (Answer.equals( "A1")||Answer.equals( "H1") ){
                System.out.println("that is correct");
                pastAnswer=Answer;
                System.out.println("where does the other rook go?" );
                Answer = User_answer.nextLine();

                    if (Answer.equals( "A1")||Answer.equals( "H1") ){
                        if (!Answer.equals(pastAnswer)){
                        System.out.println("that is correct again, nice!");
                            continue_answer = "no";//works
                        }else {
                            System.out.println("that is incorrect, there already a rook there ");
                            System.out.println("would you like to try again ? yes or no"); //no path works
                            continue_answer = continue_scan.nextLine();
                        }
                    }else {
                    System.out.println("that is incorrect");
                    System.out.println("would you like to try again ? yes or no"); //no path works
                    continue_answer = continue_scan.nextLine();
                    }

            }else {
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no");
                continue_answer = continue_scan.nextLine();
            }
        } while (continue_answer.equals( "yes"));

        // update board
        //====================================King=========TEST_NEED====================================================
        do{
            System.out.println("where does the king go? " );
            Answer = User_answer.nextLine();
            if (Answer.equals( "E1")) {
                System.out.println("that is correct");
            }else{
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no"); //no path works
                continue_answer = continue_scan.nextLine();
            }
        // update board
        }while (continue_answer.equals( "yes"));
        //====================================Knights===================================================================
        do{
            System.out.println("where do the Knights go? " );
            Answer = User_answer.nextLine();
            if (Answer.equals( "B1")||Answer.equals( "G1") ){
                System.out.println("that is correct");
                pastAnswer=Answer;
                System.out.println("where does the other Knight go?" );
                Answer = User_answer.nextLine();

                if (Answer.equals( "B1")||Answer.equals( "G1") ){
                    if (!Answer.equals(pastAnswer)){
                        System.out.println("that is correct again, nice!");
                        continue_answer = "no";//works
                    }else {
                        System.out.println("that is incorrect, there already a Knight there ");
                        System.out.println("would you like to try again ? yes or no"); //no path works
                        continue_answer = continue_scan.nextLine();
                    }
                }else {
                    System.out.println("that is incorrect");
                    System.out.println("would you like to try again ? yes or no"); //no path works
                    continue_answer = continue_scan.nextLine();
                }

            }else {
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no");
                continue_answer = continue_scan.nextLine();
            }
        } while (continue_answer.equals( "yes"));
        // update board
        //====================================Queen=========TEST_NEED===================================================
        System.out.println("where does the queen go? " );
        do{
            System.out.println("where does the queen go? " );
            Answer = User_answer.nextLine();
            if (Answer.equals( "D1")) {
                System.out.println("that is correct");
            }else{
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no"); //no path works
                continue_answer = continue_scan.nextLine();
            }
            // update board
        }while (continue_answer.equals( "yes"));
        // update board

        //===================================================Bishops====================================================
        do{
            System.out.println("where do the Bishops go? " );
            Answer = User_answer.nextLine();
            if (Answer.equals( "C1")||Answer.equals( "F1") ){
                System.out.println("that is correct");
                pastAnswer=Answer;
                System.out.println("where does the other Bishop go?" );
                Answer = User_answer.nextLine();

                if (Answer.equals( "C1")||Answer.equals( "F1") ){
                    if (!Answer.equals(pastAnswer)){
                        System.out.println("that is correct again, nice!");
                        continue_answer = "no";//works
                    }else {
                        System.out.println("that is incorrect, there already a Bishop there ");
                        System.out.println("would you like to try again ? yes or no"); //no path works
                        continue_answer = continue_scan.nextLine();
                    }
                }else {
                    System.out.println("that is incorrect");
                    System.out.println("would you like to try again ? yes or no"); //no path works
                    continue_answer = continue_scan.nextLine();
                }

            }else {
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no");
                continue_answer = continue_scan.nextLine();
            }
        } while (continue_answer.equals( "yes"));
        // update board




        // System.out.println("||Knight||Bishop||Rook||Knight||Rook||Bishop||King||Queen||" );// disorganzed set

    }
}

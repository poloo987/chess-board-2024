package pages;

import java.util.Scanner;

import static pages.CB_GameBoard.*;

public class CB_Methods {


   static String answer= "";
    static Scanner User_answer = new Scanner(System.in);


    // +++++++++++++ variables for Chessboard_page ++++++++++++++++++++
    protected static String PieceMain_01 ;
    protected static String PieceMain_02;

    protected static String Test;

    protected static Integer Piece01_Y;
    protected static Integer Piece01_X;

    protected static Integer Piece02_X ;
    protected static Integer Piece02_Y;

    static Integer Coord_X ;
    static Integer Coord_Y;


    // +++++++++++++ variables for Tut_questions ++++++++++++++++++++

    static String pastAnswer ;
    static String continue_answer = "no";
    static Scanner continue_scan   = new Scanner(System.in);

    //============methods


    public static String getAnswerCheck(String answer) {
        boolean test= true ;

        do{
        int part =Character.getNumericValue(answer.charAt(1));
            if (    answer.length() == 2
                    && (    answer.charAt(0) == 'A'||
                            answer.charAt(0) == 'B'||
                            answer.charAt(0) == 'C'||
                            answer.charAt(0) == 'D'||
                            answer.charAt(0) == 'E'||
                            answer.charAt(0) == 'F'||
                            answer.charAt(0) == 'G'||
                            answer.charAt(0) == 'H'
                    )
                    && (part >0 && part<=8 )
            ) {  test= false;}

            else{
                System.out.println("coordinate error! Try again ,input coordinate (A-H,1-8) ex:A2");
                answer = User_answer.nextLine();
            }
        }while(test);
        return answer;
    }

    public static Integer getCoord_X() {
        char letter_Char = answer.charAt(0);
        letter_Char = Character.toUpperCase(letter_Char);
        switch (letter_Char) {
            case 'A':
                Coord_Y = 0;
                break;
            case 'B':
                Coord_Y = 1;
                break;
            case 'C':
                Coord_Y = 2;
                break;
            case 'D':
                Coord_Y = 3;
                break;
            case 'E':
                Coord_Y = 4;
                break;
            case 'F':
                Coord_Y = 5;
                break;
            case 'G':
                Coord_Y = 6;
                break;
            case 'H':
                Coord_Y = 7;
                break;
        }
        return Coord_Y;
    }
    public static Integer getCoord_Y() {
        char letter_Char = answer.charAt(1);
        Coord_X = Character.getNumericValue(letter_Char) -1;
        return Coord_X;
    }



    public static boolean check_movement() {
        System.out.println("checking movement");
        //add code to not allow piece 1 == piece 2
       boolean checker = true;


        switch (PieceMain_01) {
            case "Pawn":
                getPawn.pawn_Activate();
                break;
            case "Rook": //tested -passed 11/27
                checker= getRook.rook_Activate();
                break;
            case "Knight"://tested -passed 11/27
                getKnight.knight_Activate();
                break;
            case "Bishop"://tested -passed 11/29
                checker = getBishop.bishop_Activate();
                break;
            case "Queen"://tested -passed 12/3
                checker = getQueen.queen_Activate();
                break;
            case "King"://tested -passed 12/3
                checker =getKing.king_Activate();
                break;

        } 
        return checker;
    }






    public static boolean run_Block_Check() {
        if (PieceMain_02.equals("-000-")){
            System.out.println("passed run_Block_Check");
            return true;
        }else{
            System.out.println("failed run_Block_Check");
        }
        return false;
    }
    public static boolean new_Block_Check(int x,int y) { //tested -passed 11/27
        Test =Chessborad [y-1][x-1];// -1 to turn back java cord
        if (Test.equals("-000-")){
            System.out.println("passed run_Block_Check");
            return true;
        }else{
            System.out.println("failed run_Block_Check");
            return false;
        }
    }

    public static boolean cross_Mvt_Check(int Piece01_X,int Piece01_Y,int Piece02_X,int Piece02_Y){
        Boolean crossMvtAnswer = true;
        int P1_X=Piece01_X+1;int P1_Y= Piece01_Y+1;int P2_X=Piece02_X+1;int P2_Y= Piece02_Y+1;
        if (P1_X == P2_X  ){                    // check for up or down movement
            int movement = Math.abs(P1_Y-P2_Y);// counter for loop
            if ((P1_Y-P2_Y)>=1){//postive or neg version
                for (int i = 1; i < movement+1; i++) {
                 if (new_Block_Check(P1_X, P1_Y - i) == false){crossMvtAnswer = false;}
                    System.out.println("after cross_Mvt_Check loop 1: crossMvtAnswer: "+crossMvtAnswer);
                }

                }else{
                for (int i = 1; i < movement+1; i++) {
                    if (new_Block_Check(P1_X,P1_Y+i) == false){crossMvtAnswer = false;}
                    System.out.println("after cross_Mvt_Check loop 2: crossMvtAnswer: "+crossMvtAnswer);
                    }
                }

        }else if( P1_Y == P2_Y){
            int movement = Math.abs(P1_X-P2_X);// counter for loop
            if ((P1_X-P2_X)>=1){//postive or neg version
                for (int i = 1; i < movement+1; i++) {
                    if (new_Block_Check(P1_X-i,P1_Y) == false){crossMvtAnswer = false;}
                    System.out.println("after cross_Mvt_Check loop 3: crossMvtAnswer: "+crossMvtAnswer);

                }
            }else{
                for (int i = 1; i < movement+1; i++) {
                    if (new_Block_Check(P1_X+i,P1_Y) == false){crossMvtAnswer = false;}
                    System.out.println("after cross_Mvt_Check loop 4: crossMvtAnswer: "+crossMvtAnswer);
                }
            }
        }else{
            System.out.println("invalid move");
            crossMvtAnswer = false;
            System.out.println("after cross_Mvt_Check all loops,expect: fail test: "+crossMvtAnswer);
        }
        System.out.println("after cross_Mvt_Check: "+crossMvtAnswer);
        return crossMvtAnswer;
        // will add castling stuff here later
    }

    public static boolean diag_Mvt_Check(int Piece01_X,int Piece01_Y,int Piece02_X,int Piece02_Y)  {
        int P1_X=Piece01_X+1;int P1_Y= Piece01_Y+1;int P2_X=Piece02_X+1;int P2_Y= Piece02_Y+1;
        Boolean diagMvtAnswer = true;
        if ((P1_X < P2_X && P1_Y < P2_Y) || (P1_X > P2_X && P1_Y > P2_Y)  ){// down LR  if true ----->else up LR
            if ((P1_X < P2_X && P1_Y < P2_Y)){//down LR  postive only
                int movement1 = Math.abs(P1_X-P2_X);
                //if ((P1_X-P2_X)>=1){//<---- (i think we can do without this if , but need to check.)
                    for (int i = 1; i < movement1+1; i++) {
                        if (new_Block_Check(P1_X+i,P1_Y+i) == false){diagMvtAnswer = false;}
                        System.out.println("after diag_Mvt_Check loop 1: diagMvtAnswer: "+diagMvtAnswer);
                    }

            }else if ((P1_X > P2_X && P1_Y > P2_Y)  ){//down LR  negative only
                int movement1 = Math.abs(P1_X-P2_X);
               // if ((P1_X-P2_X)>=1){//<---- (i think we can do without this if , but need to check.) //postive or neg version
                    for (int i = 1; i < movement1+1; i++) {
                        if (new_Block_Check(P1_X-i,P1_Y-i) == false){diagMvtAnswer = false;}
                        System.out.println("after diag_Mvt_Check loop 2: diagMvtAnswer: "+diagMvtAnswer);

                    }

            }
            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        }else if((P1_X < P2_X && P1_Y > P2_Y) || (P1_X > P2_X && P1_Y < P2_Y)){//else up LR
            if ((P1_X < P2_X && P1_Y > P2_Y)){//else up LR postive X only
                int movement1 = Math.abs(P1_X-P2_X);
                //if ((P1_X-P2_X)>=1){//<---- (i think we can do without this if , but need to check.) postive version
                    for (int i = 1; i < movement1+1; i++) {
                        if (new_Block_Check(P1_X+i,P1_Y-i) == false){diagMvtAnswer = false;}
                        System.out.println("after diag_Mvt_Check loop 3: diagMvtAnswer: "+diagMvtAnswer);

                    }

            }else if ((P1_X > P2_X && P1_Y < P2_Y)){//else up LR negative X only
                int movement1 = Math.abs(P1_X-P2_X);
                //if ((P1_X-P2_X)>=1){//<---- (i think we can do without this if , but need to check.)neg version
                    for (int i = 1; i < movement1+1; i++) {
                        if (new_Block_Check(P1_X-i,P1_Y+i) == false){diagMvtAnswer = false;}
                        System.out.println("after diag_Mvt_Check loop 4: diagMvtAnswer: "+diagMvtAnswer);

                    }

            }

        }else{
            System.out.println("invalid move");
            diagMvtAnswer = false;
            System.out.println("after diag_Mvt_Check all loops,expect: fail test: "+diagMvtAnswer);
        }
        System.out.println("after diag_Mvt_Check: "+diagMvtAnswer);
        return diagMvtAnswer;
    }

}

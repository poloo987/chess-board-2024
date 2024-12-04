package pages;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CB_GameBoard extends CB_Methods {

    /* */
    static CB_Pawn_Methods getPawn = new CB_Pawn_Methods();
    static CB_Rook_Methods getRook = new CB_Rook_Methods();
    static CB_Knight_Methods getKnight = new CB_Knight_Methods();
    static CB_Bishop_Methods getBishop = new CB_Bishop_Methods();
    static CB_Queen_Methods getQueen = new CB_Queen_Methods();
    static CB_King_Methods getKing = new CB_King_Methods();
    //static String[][] Chessborad = new String[8][8];/**/
    static String [][] Chessborad = {
               /* A */ /* B */   /* C */   /* D */  /* E */ /* F */   /* G */   /* H */
     /* 1 */  {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight",  "Rook"},
     /* 2 */  {"Pawn", "Pawn",   "Pawn",   "Pawn",  "Pawn", "Pawn",   "Pawn",    "Pawn"},
     /* 3 */  {"-000-","-000-",  "-000-",  "-000-", "-000-","-000-",  "-000-",  "-000-"},
     /* 4 */  {"-000-","-000-",  "-000-",  "-000-", "-000-","-000-",  "-000-",  "-000-"},
     /* 5 */  {"-000-","-000-",  "-000-",  "-000-",  "-000-","-000-",  "-000-",  "-000-"},
     /* 6 */  {"-000-","-000-",  "-000-",  "-000-", "-000-","-000-",  "-000-",  "-000-"},
     /* 7 */  {"Pawn", "Pawn",   "Pawn",   "Pawn",  "Pawn", "Pawn",   "Pawn",    "Pawn"},
     /* 8 */  {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight",  "Rook"}
        };
    public static void run_SaveFile() throws FileNotFoundException {
        int SF_Answer1= 1; int SF_Answer2= 1; String date = "00-00-000";String pizza= "00-00-000";String fileName = "C:\\Users\\franc\\IdeaProjects\\chess-board-2024\\CB_game_save_00-00-000_file.txt";
        File loadedFile = new File(fileName);//"CB_game_save_"+date+"_file.txt"//may need to add player turn and time
        //PrintWriter SFPrinter = new PrintWriter(loadedFile);

        SF_Answer1=JOptionPane.showConfirmDialog(null, "do you want to load a saved game file? or start a new game?");
        switch (SF_Answer1){
            case 0://yes
               do{
                   try{
                        //take file from user
                        fileName = JOptionPane.showInputDialog(null, "Enter the .txt. file name, example: CB_game_save_00-00-000_file.txt");
                   }catch (Exception e){
                        System.out.println("------ File Error ----------");
                        SF_Answer2=JOptionPane.showConfirmDialog(null, "do you want to try again ? or start a new game?");
                        if(SF_Answer2==1){
                            fileName = "CB_game_save_00-00-000_file.txt";}
                   }//end of catch
               }while (SF_Answer2 ==0);
            break;

            case 1://no
                System.out.println("starting a new game");
                fileName = "CB_game_save_00-00-000_file.txt";
            break;
        }
        Scanner SF_Scan = new Scanner(loadedFile);
        for (int y = 0; y < Chessborad.length; y++) {
            for (int x = 0; x < Chessborad[y].length; x++) {
                if(SF_Scan.hasNext()) {
                    Chessborad[y][x] =SF_Scan.nextLine();

                }else {
                    System.out.println("no more line");
                    System.out.println("the x: "+x);
                    System.out.println("the y: "+y);
                }
            }
        }
    }

    public static void select_Piece()  {
    boolean test_CBgb = true;

        for (int y = 0; y < Chessborad.length; y++) {
            for (int x = 0; x < Chessborad[y].length; x++) {
                System.out.print(Chessborad[y][x] + " ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println("what piece do you want to move? input coordinate (A-H,1-8) ex:A2");
        answer = User_answer.nextLine();
        answer = getAnswerCheck(answer);

        Piece01_X = getCoord_X();//A
        Piece01_Y = getCoord_Y();//2
        PieceMain_01 = Chessborad [Piece01_Y][Piece01_X];
        //check_Team(); makes sure that PieceMain_01 in yours
        do {
        System.out.println("where do want to move it? ?");
        answer = User_answer.nextLine();
        answer = getAnswerCheck(answer);
        Piece02_X = getCoord_X();//A
        Piece02_Y = getCoord_Y();//3
        PieceMain_02 = Chessborad [Piece02_Y][Piece02_X];
        test_CBgb = check_movement();
        // can add player quit choice later
        } while (!test_CBgb);//tested -passed 11/27

        System.out.println("end");// don't for get to close your image so the program closes
    }
}





package pages;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static pages.CB_Save_Methods.boardUpdate;
import static pages.CB_Save_Methods.run_SaveFile;

public class CB_GameBoard extends CB_Methods {

    /* */
    static CB_Pawn_Methods getPawn = new CB_Pawn_Methods();
    static CB_Rook_Methods getRook = new CB_Rook_Methods();
    static CB_Knight_Methods getKnight = new CB_Knight_Methods();
    static CB_Bishop_Methods getBishop = new CB_Bishop_Methods();
    static CB_Queen_Methods getQueen = new CB_Queen_Methods();
    static CB_King_Methods getKing = new CB_King_Methods();
    static String [][] Chessborad = {

    //                |*---A---|   |---B---*|   |*---C---|   |---D---*|   |*---E---|   |---F---*|   |*---G---|   |---H---*|
    /*|*---1---|*/  {"|--Rook-W|","|Knight-W|","|Bishop-W|","|-Queen-W|","|--King-W|","|Bishop-W|","|Knight-W|","|--Rook-W|"},
    /*|*---2---|*/  {"|-Pawn--W|","|-Pawn--W|","|-Pawn--W|","|-Pawn--W|","|-Pawn--W|","|-Pawn--W|","|-Pawn--W|","|-Pawn--W|"},
    /*|*---3---|*/  {"|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|"},
    /*|*---4---|*/  {"|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|Bishop-B|","|*--00--*|","|*--00--*|","|*--00--*|"},
    /*|*---5---|*/  {"|*--00--*|","|--Rook-B|","|*--00--*|","|--King-W|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|"},
    /*|*---6---|*/  {"|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|","|*--00--*|"},
    /*|*---7---|*/  {"|-Pawn--B|","|-Pawn--B|","|-Pawn--B|","|-Pawn--B|","|-Pawn--B|","|-Pawn--B|","|-Pawn--B|","|-Pawn--B|"},
    /*|*---8---|*/  {"|--Rook-B|","|Knight-B|","|Bishop-B|","|-Queen-B|","|--King-B|","|Bishop-B|","|Knight-B|","|--Rook-B|"},
        };

    public static void gameSetup() throws FileNotFoundException {
        run_SaveFile();
        boardUpdate();

    }

    public static void rungame()  {
        boolean runAnswer = true;
        String PT = "W";

        System.out.println("let the game begin !");
        System.out.println("white team will go first -player");
        do {
            System.out.println("to end the game type:  ");
            answer = User_answer.nextLine();
            if(answer.equals("Quit")){runAnswer = false;}
            System.out.println("type w or B ");
            PT = User_answer.nextLine();
            select_Piece(PT);

    } while (!runAnswer);

    }
    public static void select_Piece(String PT)  {
    boolean test_CBgb = true;
        do {
        System.out.println("what piece do you want to move? input coordinate (A-H,1-8) ex:A2");
        answer = User_answer.nextLine();
        answer = getAnswerCheck(answer);

        Piece01_X = getCoord_X();//A
        Piece01_Y = getCoord_Y();//2
        PieceMain_01 = Chessborad [Piece01_Y][Piece01_X];
        check_Team(PT);
        } while (!test_CBgb);
        test_CBgb = true;
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
        player_movement();

        System.out.println("end");// don't for get to close your image so the program closes
    }
}





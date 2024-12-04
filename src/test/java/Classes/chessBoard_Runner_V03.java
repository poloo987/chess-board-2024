package Classes;


import pages.CB_GameBoard;

import java.io.FileNotFoundException;


public class chessBoard_Runner_V03 {
    public static void main(String[] args) throws FileNotFoundException {
//look up Coordinates.class in java

        // make this the home page
        CB_GameBoard getCB_GameBoard = new CB_GameBoard();
        System.out.println("welcome to the wolf's chess game ");

        System.out.println("pick your game mode  ");
        System.out.println("1 = chess match PvP ");
        //getCB_GameBoard.run_SaveFile();
        getCB_GameBoard.select_Piece();

        //System.out.println("2 = tutorial - comming soon  ");
        //answer = User_answer.nextLine();
        //answer = getAnswerCheck();//need testing
        //System.out.println("chess match PvP selected");
        //getCB_GameBoard.select_Piece();


       /* switch (answer) {
            case "1":
                System.out.println("chess match PvP selected");


                break;
            case "2":

                break;
        }*/

        // for phase 2 chessboard













    }
}

package pages;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static pages.CB_GameBoard.Chessborad;

public class CB_Save_Methods extends CB_Methods{
    public static void run_SaveFile() throws FileNotFoundException { //polymorphism would fit really well here
        int SF_Answer1= 1; int SF_Answer2= 1; String date = "00-00-000";String pizza= "00-00-000";String fileName = "C:\\Users\\franc\\IdeaProjects\\chess-board-2024\\CB_game_save_00-00-000_file.txt";
        File loadedFile = new File(fileName);//"CB_game_save_"+date+"_file.txt"//may need to add player turn and time
        //PrintWriter SFPrinter = new PrintWriter(loadedFile);

        SF_Answer1= JOptionPane.showConfirmDialog(null, "do you want to load a saved game file? or start a new game?");
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

    public static void boardUpdate(){

        System.out.println("here is the updated board");
        System.out.println(" ");
        System.out.println("|*------*| |*---A---||---B---*||*---C---||---D---*||*---E---||---F---*||*---G---||---H---*|");

        for (int y = 0; y < Chessborad.length; y++) {
            System.out.print("|*---"+(y+1)+"---| ");
            for (int x = 0; x < Chessborad[y].length; x++) {
                System.out.print(Chessborad[y][x]);
            }
            System.out.println(); // New line after each row
        }
        System.out.println(" ");System.out.println(" ");
    }
}

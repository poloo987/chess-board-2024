package pages;

import javax.swing.*;
import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Timer;

import static pages.CB_GameBoard.Chessborad;

public class CB_SaveFile_Methods extends CB_Methods{
    static LocalDateTime startTime = LocalDateTime.now();
    public static void run_SaveFile() throws FileNotFoundException { //polymorphism would fit really well here

        String SF_Answer1= ""; String SF_Answer2= ""; String date = "00-00-000";String pizza= "00-00-000";
        String fileName = "CB_game_save_00-00-000_file.txt";
        System.out.println("do you want to load a saved game file? (type:load ) or start a new game? (type: new )");
        SF_Answer1=User_answer.nextLine();
        switch (SF_Answer1){
            case "load":
                do{
                    try{
                        //take file from user
                        System.out.println("Enter the .txt. file name, example: CB_game_save_00-00-000_file.txt");
                        fileName= User_answer.nextLine();

                    }catch (Exception e){
                        System.out.println("------ File Error ----------");
                        System.out.println("do you want to try again ? (type: again ) or start a new game? (type:new)");
                        SF_Answer2 = User_answer.nextLine();

                        if(SF_Answer2.equals("new")){
                            fileName = "CB_game_save_00-00-000_file.txt";}
                    }//end of catch
                }while (SF_Answer2.equals("new"));
                break;

            case "new":
                System.out.println("starting a new game");
                fileName = "CB_game_save_00-00-000_file.txt";
                break;
        }


        File loadedFile = new File(fileName);//"CB_game_save_"+date+"_file.txt"//may need to add player turn and time
        Scanner SF_Scan = new Scanner(loadedFile);
        for (int y = 0; y < Chessborad.length; y++) {
            for (int x = 0; x < Chessborad[y].length; x++) {
                if(SF_Scan.hasNext()) {
                    Chessborad[y][x] =SF_Scan.nextLine();

                }else {//i dont know when this will run
                    System.out.println("no more line");
                    System.out.println("the x: "+x);
                    System.out.println("the y: "+y);
                }
            }
        }
    }
    public static void Update(){

    }
    public static void boardUpdate(){

        System.out.println("here is the updated board");
        System.out.println(" ");
        // add the letter row at the top of the board
        System.out.println("|*------*| |*---A---||---B---*||*---C---||---D---*||*---E---||---F---*||*---G---||---H---*|");
        // for add the number colum on the left side of the board
        for (int y = 0; y < Chessborad.length; y++) {
            System.out.print("|*---"+(y+1)+"---| ");
            for (int x = 0; x < Chessborad[y].length; x++) {
                System.out.print(Chessborad[y][x]);
            }
            System.out.println(); // New line after each row
        }
        System.out.println(" ");System.out.println(" ");
    }
    public static void makeNewFile() throws FileNotFoundException {
        System.out.println("do you want to save this game? ( type: Yes )");
        String temVar =User_answer.nextLine();
        if (temVar.equalsIgnoreCase("yes")) {
            try {
                File file1 = new File("CB_game_save_00-00-003_file.txt");
                if (file1.createNewFile()) {
                    System.out.println("File created: " + file1.getName());
                    FileWriter myWriter = new FileWriter(file1);
                    for (int y = 0; y < Chessborad.length; y++) {
                        for (int x = 0; x < Chessborad[y].length; x++) {
                            String data = Chessborad[y][x];
                            myWriter.write(data + "\n");

                        }
                    }
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public static void showGameTime(){
       // I = start time , end time , date
       // P =  end - start == game time , file name = date+gameTime
       // O = file name for new save
        // notes: IDK how to get endTime to set of at later time in the program

        //LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        //Format the date and time (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_HH_mm_ss");
        String formattedDateTime = startTime.format(formatter);

        // Print the formatted date and time
       System.out.println("Current Date and Time: " + formattedDateTime);
        System.out.println("this is the duration "+format(duration));


    }
    public static String format(Duration d) {

        long days = d.toDays();

        d = d.minusDays(days);

        long hours = d.toHours();

        d = d.minusHours(hours);

        long minutes = d.toMinutes();

        d = d.minusMinutes(minutes);

        long seconds = d.getSeconds() ;

        return

                (days ==  0?"":days+" days,")+

                        (hours == 0?"":hours+" hours,")+

                        (minutes ==  0?"":minutes+" minutes,")+

                        (seconds == 0?"":seconds+" seconds,");

    }
}

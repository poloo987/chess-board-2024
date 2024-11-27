package week_2;

//Practice writing/outputting to a .txt file using the PrintWriter class
//I - user name and degree pgm
//P - write that data to the .txt file and count
//O - Number of Records written
import javax.swing.JOptionPane;
import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
public class FileWriteEx1 {
    public static void main(String[] args) throws Exception {
//variables
        String name = null;
        String degree = null;
        int recCount = 0;
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
//create a file object
        File file1 = new File("salesFile.txt");
        if(file1.exists())

        {
            System.out.println("This file already exists");
            System.exit(1);
        }
//create a PrintWriter object
//this is where the .txt file gets created
        PrintWriter fPrint1 = new PrintWriter(file1);
        name = JOptionPane.showInputDialog(null, "Enter your full name");
        degree = JOptionPane.showInputDialog(null, "Enter your degree");
//this line of code writes the data to the .txt file
        fPrint1.print(name + " : " + degree);
//close the PrintWriter
        fPrint1.close();
    }//end of main() method
//---------------------------------------
}//end of pgm


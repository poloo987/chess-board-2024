package week_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;



public class Lab8 {
    public static void main(String[] args) throws Exception {
        labPhase();
    }

    public static void labPhase() throws FileNotFoundException {
        double inNum=0.0;
        int recCount = 0;
        double total = 0.0;
        double avg = 0;
        String fileName = "attendData.txt";
        double [] salesArr = new double[16];

//create a file object
        File inputDataFile = new File(fileName);
        try {
//create a file Scanner object
            Scanner fScan = new Scanner(inputDataFile);
//loop to load an array with data from a file
            for(int i = 0; i < salesArr.length; i++){
                salesArr[i] = fScan.nextDouble();
                inNum =salesArr[i];
                recCount++;
                total += inNum;
            }
            fScan.close();
            System.out.println(java.util.Arrays.toString(salesArr));
            avg = total / recCount;
        }//end of try
        catch (Exception e) {
            System.out.println("------ File Error ----------");
            System.exit(9);
        }//end of catch
        LocalDate theDate = LocalDate.now();
        File outPutReportFile = new File("report1.txt");

        if (outPutReportFile.exists()) {
            System.out.println("This file already exists");
            System.exit(1);
        }
//create a PrintWriter object
//this is where the .txt file gets created
        PrintWriter fPrint1 = new PrintWriter(outPutReportFile);
        fPrint1.println("Today's Date - " + theDate);
        fPrint1.println("Attendance Report");
        fPrint1.println("The total number of days: "+recCount);
        fPrint1.println("The average daily attendance: "+avg);
        fPrint1.close();
    }
}

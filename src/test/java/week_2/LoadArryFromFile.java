package week_2;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class LoadArryFromFile {

    public static void main(String[] args) throws Exception {
        double [] salesArr = new double[15];
//variables
        String fileName = null;
        int recCount = 0;
        fileName = JOptionPane.showInputDialog(null, "Enter the .txt. file name");
//create a file object
        File f1 = new File(fileName);
//create a file Scanner object
        Scanner fScan = new Scanner(f1);
//loop to load an array with data from a file
        for(int i = 0; i < salesArr.length; i++){
            salesArr[i] = fScan.nextDouble();
        }
        fScan.close();
        System.out.println(java.util.Arrays.toString(salesArr));
    }
}

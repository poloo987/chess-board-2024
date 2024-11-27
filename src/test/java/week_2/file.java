package week_2;
import javax.swing.JOptionPane;
import java.io.File;
import java.util.Scanner;

public class file {
    //-----------------WEDNESDAY - add IF in the main()
//Read data from a .txt file
//I - .txt file name
//P - Read all the records in a .txt file and output them
//O - The data the file ad a record count


        public static void main(String[] args) throws Exception {
//invoke this method to output a numeric file
//outputNumFile();
//invoke this method to output a String file
            outputStringFile();
        }//end of main() method
        //---------------------------------------
//this will output the contents of any numeric file
        public static void outputNumFile(){
//variables
            double inNum = 0.0;
            int recCount = 0;
            double total = 0.0;
            String fileName = null;
            fileName = JOptionPane.showInputDialog(null, "Enter the .txt name for the file you want to output");
//create file object
                    File f1 = new File(fileName);
            try{
//create file scanner object
                Scanner fScan1 = new Scanner(f1);
//read, output and total all the records in the file
//check to see if there is another record in the file
                System.out.println("--------------------------");
                while(fScan1.hasNext()){
//this will scan a record of data from the file
                    inNum = fScan1.nextDouble();
                    recCount++;
                    total+= inNum;
                    System.out.println(inNum);
                }
//close file
                fScan1.close();
                System.out.println("--------------------------");
                System.out.println("Record Count : " + recCount);
                System.out.println("Total : " + total);
                System.out.println("--------------------------");
            }//end of try
            catch (Exception e){
                System.out.println("------ File Error ----------");
                System.exit(9);
            }//end of catch
        }//end of method
        //this will output the contents of any numeric file
        public static void outputStringFile(){
//variables
            String inString = null;
            int recCount = 0;
            String fileName = null;
            fileName = JOptionPane.showInputDialog(null, "Enter the .txt name for the file you want to output");
//create file object
                    File f1 = new File(fileName);
            try{
//create file scanner object
                Scanner fScan1 = new Scanner(f1);
//read, output and total all the records in the file
//check to see if there is another record in the file
                System.out.println("--------------------------");
                while(fScan1.hasNext()){
//this will scan a record of data from the file
                    inString = fScan1.nextLine();
                    recCount++;
                    System.out.println(inString);
                }
//close file
                fScan1.close();
                System.out.println("--------------------------");
                System.out.println("Record Count : " + recCount);
                System.out.println("--------------------------");
            }//end of try
            catch (Exception e){
                System.out.println("------ File Error ----------");
                System.exit(9);
            }//end of catch
        }//end of method

}

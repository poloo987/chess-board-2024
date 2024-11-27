package week_2;

import java.io.FileWriter;
import java.io.IOException;

public class myMethods {


    public static int getNumCredits(int credits_num) {

        int  tuition = credits_num * 190;

        return tuition;
    }

    public static int getNumFasfa(int fasa_duc, int credits_cost) {

        int  tuition = credits_cost - fasa_duc;

        return tuition;
    }

    public static void runPrint(int fasa_duc) throws IOException {

        String fileText="Your estimated tuition with financial aid is $"+fasa_duc;
        FileWriter writer= new FileWriter("/Users/franc/OneDrive/Desktop/lab_5a_text.txt");
        writer.write(fileText);
        writer.close();

    }

}

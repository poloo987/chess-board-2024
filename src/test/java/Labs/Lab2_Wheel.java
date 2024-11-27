package Labs;
import java.util.Random;
import javax.swing.JOptionPane;
public class Lab2_Wheel {
    public static void main(String[] args){
        int dice4 = 1;
        Random rand1 = new Random();
        dice4 = rand1.nextInt(5);
        System.out.println("Welcome to the Wheel of Fortune");
        System.out.println("Here we go ");
        switch (dice4) {
            case 0://|Knight_|
                JOptionPane.showMessageDialog(null, "BANKRUPT");

                break;
            case 1://|Bishop_|
                JOptionPane.showMessageDialog(null, "Congratulations You won : $1,000");

                break;
            case 2://|_Queen_|
                JOptionPane.showMessageDialog(null, "Congratulations You won : $2,000");
                break;
            case 3://|_King__
                JOptionPane.showMessageDialog(null, "Congratulations You won : a car!");

                break;
            case 4://|Knight_|
                JOptionPane.showMessageDialog(null, "Congratulations You won : a house!");
                break;
        }
    }
}

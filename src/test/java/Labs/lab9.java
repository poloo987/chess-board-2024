package Labs;

import javax.swing.*;
import java.util.ArrayList;



public class lab9 {
    public static void main(String[] args){
        passwordCheck();

    }
    public static void passwordCheck (){
        ArrayList<Character> passwordArray = new ArrayList<>();
        Boolean test = true; char alert3  = '#';
        //qwertdo{
            String answer =JOptionPane.showInputDialog(null, "hello user please  create a password ");
            //System.out.println( answer.toCharArray()); for testing
            //answer.toCharArray();
            for (int i = 0;i < answer.length();i ++ ){
                passwordArray.add(answer.charAt(i));
                //passwordArray.contains()
                System.out.println(passwordArray.get(i));
                switch (passwordArray.get(i)){
                    case '@':
                        System.out.println("error - password has @ , please try again");
                        break;
                    case ' ':
                        System.out.println("error - password has a space , please try again");
                        break;

                }
            }
            if (passwordArray.size()< 7){
                System.out.println("error - password is too short , please try again");
            }
            if (passwordArray.size()> 14){
                System.out.println("error - password is too long , please try again");
            }
            int hash =  answer.length()-1;
            //if (answer.charAt(hash)=='#'){System.out.println("error - password need to end with #, please try again");}

        //}while (test = false);
    }
}

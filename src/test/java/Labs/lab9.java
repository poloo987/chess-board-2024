package Labs;

import javax.swing.*;
import java.util.ArrayList;



public class lab9 {
    public static void main(String[] args){

        Boolean checkPW = true;
        do {
            boolean pw =passwordCheck();
            if (pw) {
                System.out.println("your password has passed , thank you");
                checkPW = false;
            } else {
                System.out.println("sorry your password has not passed, would you like to try again ");
                int answer =JOptionPane.showConfirmDialog(null, "");
                if(answer==1){checkPW = false;
                    System.out.println("your answer will not be add to database");};
            }
        }while (checkPW );
    }
    public static boolean passwordCheck (){
        ArrayList<Character> passwordArray = new ArrayList<>();
        Boolean test = true; char alert3  = '#';

            String answer =JOptionPane.showInputDialog(null, "hello user please  create a password ");
            //System.out.println( answer.toCharArray()); for testing
            //answer.toCharArray();
            for (int i = 0;i < answer.length();i ++ ){
                passwordArray.add(answer.charAt(i));
                //System.out.println(passwordArray.get(i));
                switch (passwordArray.get(i)){
                    case '@':
                        System.out.println("error - password has @ , please try again");
                        test = false;
                        break;
                    case ' ':
                        System.out.println("error - password has a space , please try again");
                        test = false;
                        break;

                }
            }
            if (!Character.isLetter(answer.charAt(0))){
                System.out.println("error - password your pasword dose not start with a letter , please try again");
                test = false;
            }
            if (passwordArray.size()< 7){
                System.out.println("error - password is too short , please try again");
                test = false;
            }
            if (passwordArray.size()> 14){
                System.out.println("error - password is too long , please try again");
                test = false;
            }
            int hash =  answer.length()-1;
            if (!(answer.charAt(hash)=='#')){System.out.println("error - password need to end with #, please try again");}


        return test;
    }
}

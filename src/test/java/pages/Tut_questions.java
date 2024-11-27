package pages;

public class Tut_questions extends CB_Methods {
    public static void king_QA(){
        do{
            System.out.println("where does the king go? " );
            answer = User_answer.nextLine();
            if (answer.equals( "E1")) {
                System.out.println("that is correct");
                continue_answer = "no";
            }else{
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no"); //no path works
                continue_answer = continue_scan.nextLine();
            }
            // update board
        }while (continue_answer.equals( "yes"));

    }
    public static void queen_QA(){
        do{
            System.out.println("where does the queen go? " );
            answer = User_answer.nextLine();
            if (answer.equals( "D1")) {
                System.out.println("that is correct");
                continue_answer = "no";
            }else{
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no"); //no path works
                continue_answer = continue_scan.nextLine();

            }
            // update board
        }while (continue_answer.equals( "yes"));

    }
    public static void bishops_QA(){
        do{
            System.out.println("where do the Bishops go? " );
            answer = User_answer.nextLine();
            if (answer.equals( "C1")|| answer.equals( "F1") ){
                System.out.println("that is correct");
                pastAnswer= answer;
                System.out.println("where does the other Bishop go?" );
                answer = User_answer.nextLine();

                if (answer.equals( "C1")|| answer.equals( "F1") ){
                    if (!answer.equals(pastAnswer)){
                        System.out.println("that is correct again, nice!");
                        continue_answer = "no";//works
                    }else {
                        System.out.println("that is incorrect, there already a Bishop there ");
                        System.out.println("would you like to try again ? yes or no"); //no path works
                        continue_answer = continue_scan.nextLine();
                    }
                }else {
                    System.out.println("that is incorrect");
                    System.out.println("would you like to try again ? yes or no"); //no path works
                    continue_answer = continue_scan.nextLine();
                }

            }else {
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no");
                continue_answer = continue_scan.nextLine();
            }
        } while (continue_answer.equals( "yes"));

    }
    public static void knights_QA(){
        do{
            System.out.println("where do the Knights go? " );
            answer = User_answer.nextLine();
            if (answer.equals( "B1")|| answer.equals( "G1") ){
                System.out.println("that is correct");
                pastAnswer= answer;
                System.out.println("where does the other Knight go?" );
                answer = User_answer.nextLine();

                if (answer.equals( "B1")|| answer.equals( "G1") ){
                    if (!answer.equals(pastAnswer)){
                        System.out.println("that is correct again, nice!");
                        continue_answer = "no";//works
                    }else {
                        System.out.println("that is incorrect, there already a Knight there ");
                        System.out.println("would you like to try again ? yes or no"); //no path works
                        continue_answer = continue_scan.nextLine();
                    }
                }else {
                    System.out.println("that is incorrect");
                    System.out.println("would you like to try again ? yes or no"); //no path works
                    continue_answer = continue_scan.nextLine();
                }

            }else {
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no");
                continue_answer = continue_scan.nextLine();
            }
        } while (continue_answer.equals( "yes"));

    }
    public static void rook_QA(){

        do{
            System.out.println("where do the rooks go? " );
            answer = User_answer.nextLine();
            if (answer.equals( "A1")|| answer.equals( "H1") ){
                System.out.println("that is correct");
                pastAnswer= answer;
                System.out.println("where does the other rook go?" );
                answer = User_answer.nextLine();

                if (answer.equals( "A1")|| answer.equals( "H1") ){
                    if (!answer.equals(pastAnswer)){
                        System.out.println("that is correct again, nice!");
                        continue_answer = "no";//works
                    }else {
                        System.out.println("that is incorrect, there already a rook there ");
                        System.out.println("would you like to try again ? yes or no"); //no path works
                        continue_answer = continue_scan.nextLine();
                    }
                }else {
                    System.out.println("that is incorrect");
                    System.out.println("would you like to try again ? yes or no"); //no path works
                    continue_answer = continue_scan.nextLine();
                }

            }else {
                System.out.println("that is incorrect");
                System.out.println("would you like to try again ? yes or no");
                continue_answer = continue_scan.nextLine();
            }
        } while (continue_answer.equals( "yes"));
    }








}

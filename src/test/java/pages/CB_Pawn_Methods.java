package pages;
/* rules of a pawn
* movement check = block check  (king check) ,1st move check , queen check ,
*
* kill check
* +++enum in java +++
 PieceMain_01
 PieceMain_02

  Piece01_X
  Piece01_Y
  *
  Piece02_X
  Piece02_Y
* */

public class CB_Pawn_Methods extends CB_Methods {

    public static void pawn_Activate() { // might need to add a OR  to include the rush check () // && these are called operators right

        // code for passive pawn move  ============================================================================
          if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y +1){
              run_Block_Check();
              run_Queen_Check();

          } else if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y +2){
              run_Rush_Check();

            }else { System.out.println("invalid move "); }

          // need to find a way to separate this code to work indepent of the checks above @@@@@@@
        /*
        if (run_Block_Check()==true) {
            //System.out.println(" move pawn ");
            if (run_Queen_Check()==true && run_Block_Check()==true) {
                System.out.println(" turn pawn into queen ");
            }
        }
        else {
            System.out.println("don't move pawn ");
        }

         */
        //@@@@@@@@@@@@@@@@@@@@

    // END code for passive pawn move  ============================================================================
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // code for aggressive pawn move  ============================================================================
        /*
        if (Piece02_X == Piece01_X-1 && Piece02_Y == Piece01_Y +1){
            run_Block_Check(); // need the false
            run_Queen_Check();

        }
*/


    }






    public static void run_Rush_Check() {
        if ((run_Block_Check()==true)&&(Piece01_X == 2 ||Piece01_X == 7)) {
            System.out.println("passed run_Rush_Check");
            System.out.println(" move pawn ");
        } else {
            System.out.println("failed run_Rush_Check");
            System.out.println("don't move pawn ");
        }
    }

    public static boolean run_Queen_Check() {

        if (Piece02_Y == 8 ) {// if it break change Y to X in Piece02_Y
                return true;
            } else {
                return false;
            }

        }
    }




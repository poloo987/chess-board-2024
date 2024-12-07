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
        String grabLLP1= Character.toString(PieceMain_01.charAt(PieceMain_01.length()-2));
        if(grabLLP1.equals("W")){
            if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y +1){
                last_Space_Check(Piece02_X, Piece02_Y,Piece01_X);


            } else if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y +2){
                last_Space_Check(Piece02_X, Piece02_Y,Piece01_X);
                //run_Rush_Check();

            }else { System.out.println("invalid move "); }

        }else if (grabLLP1.equals("B")){
            if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y -1){
                last_Space_Check(Piece02_X, Piece02_Y,Piece01_X);
                //run_Queen_Check();


            } else if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y -2){
                last_Space_Check(Piece02_X, Piece02_Y,Piece01_X);
                //run_Rush_Check();

            }else { System.out.println("invalid move "); }
        }
    }
    public static void run_Rush_Check(int P2_X,int P2_Y) {
        if ((new_Block_Check(P2_X,P2_Y)==true)&&(Piece01_X == 2 ||Piece01_X == 7)) {
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




package pages;


public class CB_Pawn_Methods extends CB_Methods {

    public static boolean pawn_Activate() { // might need to add a OR  to include the rush check () // && these are called operators right
        boolean pawnActTest= true ;

        String grabLLP1= Character.toString(PieceMain_01.charAt(PieceMain_01.length()-2));
        if(grabLLP1.equals("W")){
            if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y +1){
                pawnActTest=  run_Block_Check(Piece02_X+1,Piece02_Y+1);

            } else if (Piece01_Y==1 &&Piece01_X == Piece02_X && Piece02_Y == Piece01_Y +2){
                if(!((run_Block_Check(Piece02_X+1,Piece02_Y))&& (run_Block_Check(Piece02_X+1,Piece02_Y+1)))){
                    pawnActTest= false;
                }
            }else { System.out.println("invalid move ");pawnActTest= false ; }

        }else if (grabLLP1.equals("B")){
            if (Piece01_X == Piece02_X && Piece02_Y == Piece01_Y -1){
                pawnActTest=  run_Block_Check(Piece02_X+1,Piece02_Y+1);
                //run_Queen_Check();
            }  else if (Piece01_Y==6 &&Piece01_X == Piece02_X && Piece02_Y == Piece01_Y -2){
                if(!(run_Block_Check(Piece02_X+1,Piece02_Y))&& (run_Block_Check(Piece02_X+1,Piece02_Y+1))){
                    pawnActTest= false;
                }

            }else { System.out.println("invalid move ");pawnActTest= false ;}
        }
        return pawnActTest;
    }

    public static boolean run_Queen_Check() {

        if (Piece02_Y == 8 ) {// if it break change Y to X in Piece02_Y
                return true;
            } else {
                return false;
            }

        }
    }




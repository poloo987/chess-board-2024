package pages;

public class CB_King_Methods  extends CB_Methods{
    public static Boolean king_Activate() { // need testing 11/23
        boolean kingActTest= true;

        if (king_Rom_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y)){
            if (last_Space_Check(Piece02_X, Piece02_Y,Piece01_X)){  // need to find a way to make P1_X P1_Y P2_X P2_Y avalbe to all methodes
                kingActTest = true ;
            }else {
                kingActTest = false ;
            }
        }
        return kingActTest;
    }
    public static boolean king_Rom_Check(int Piece01_X, int Piece01_Y, int Piece02_X, int Piece02_Y){
        boolean kingRomAnswer= true ;
        if(Piece02_X == Piece01_X && Piece02_Y == Piece01_Y -1){ //north
            System.out.println("in range");
        }else if (Piece02_X == Piece01_X && Piece02_Y == Piece01_Y +1){//south
            System.out.println("in range");
        }
        else if (Piece02_X == Piece01_X +1 && Piece02_Y == Piece01_Y){//east
            System.out.println("in range");
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y){//west
            System.out.println("in range");
        }
        else if (Piece02_X == Piece01_X +1  && Piece02_Y == Piece01_Y -1){//north east
            System.out.println("in range");
        }
        else if (Piece02_X == Piece01_X +1 && Piece02_Y == Piece01_Y +1){//south east
            System.out.println("in range");
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y +1){//south west
            System.out.println("in range");
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y -1){//north west
            System.out.println("in range");
        }else{
            System.out.println("invalid move -out of king range");
            kingRomAnswer=false;
        }
        return kingRomAnswer;
    }
}


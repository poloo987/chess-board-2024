package pages;

public class CB_King_Methods  extends CB_Methods{
    public static Boolean king_Activate() { // need testing 11/23
        boolean kingActTest= true;
        if(Piece02_X == Piece01_X && Piece02_Y == Piece01_Y -1){ //north
            kingActTest=run_Block_Check();
        }else if (Piece02_X == Piece01_X && Piece02_Y == Piece01_Y +1){//south
            kingActTest=run_Block_Check();
        }
        else if (Piece02_X == Piece01_X +1 && Piece02_Y == Piece01_Y){//east
            kingActTest=run_Block_Check();
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y){//west
            kingActTest=run_Block_Check();
        }
        else if (Piece02_X == Piece01_X +1  && Piece02_Y == Piece01_Y -1){//north east
            kingActTest=run_Block_Check();
        }
        else if (Piece02_X == Piece01_X +1 && Piece02_Y == Piece01_Y +1){//south east
            kingActTest=run_Block_Check();
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y +1){//south west
            kingActTest=run_Block_Check();
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y -1){//north west
            kingActTest=run_Block_Check();
        }else{
            System.out.println("invalid move ");
            kingActTest=false;
        }
        return kingActTest;
    }
}


package pages;

public class CB_King_Methods  extends CB_Methods{
    public static void king_Activate() { // need testing 11/23

        if(Piece02_X == Piece01_X && Piece02_Y == Piece01_Y -1){ //north
            run_Block_Check();
        }else if (Piece02_X == Piece01_X && Piece02_Y == Piece01_Y +1){//south
            run_Block_Check();
        }
        else if (Piece02_X == Piece01_X +1 && Piece02_Y == Piece01_Y){//east
            run_Block_Check();
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y){//west
            run_Block_Check();
        }
        else if (Piece02_X == Piece01_X +1  && Piece02_Y == Piece01_Y -1){//north east
            run_Block_Check();
        }
        else if (Piece02_X == Piece01_X +1 && Piece02_Y == Piece01_Y +1){//south east
            run_Block_Check();
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y +1){//south west
            run_Block_Check();
        }
        else if (Piece02_X == Piece01_X -1 && Piece02_Y == Piece01_Y -1){//north west
            run_Block_Check();
        }else{
            System.out.println("invalid move ");
        }
    }
}


package pages;

public class CB_Queen_Methods extends CB_Methods {
    public static Boolean queen_Activate() {
        //Piece01_X,Piece01_Y,Piece02_X,Piece02_Y
        boolean queenActTest= true ;
        try{
            int slope = ((Piece02_Y-Piece01_Y)/((-1*Piece02_X )-(-1*Piece01_X)));
            if (slope == 1 || slope==-1 ){
                queenActTest=diag_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);// testing 11/23
            }else if (Piece01_X == Piece02_X || Piece01_Y == Piece02_Y ){
                queenActTest= cross_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);
            }else{
                System.out.println("invalid move ");
                queenActTest=false;
            }




        }catch (ArithmeticException ae){
            if (Piece01_X == Piece02_X || Piece01_Y == Piece02_Y ){
                queenActTest= cross_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);
            }else{
                System.out.println("invalid move ");
                queenActTest=false;
            }

        } // will add castling stuff here later
        return queenActTest;
    }
}

package pages;

public class CB_Queen_Methods extends CB_Methods {
    public static void queen_Activate() {
        //Piece01_X,Piece01_Y,Piece02_X,Piece02_Y
        try{
            int slope = ((Piece02_Y-Piece01_Y)/((-1*Piece02_X )-(-1*Piece01_X)));
            if (slope == 1 || slope==-1 ){
                diag_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);// testing 11/23
            }else{
                System.out.println("invalid move ");
            }
        }catch (ArithmeticException ae){

            if (Piece01_X == Piece02_X || Piece01_Y == Piece02_Y ){
                cross_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);
            }else{
                System.out.println("invalid move ");
             }
        } // will add castling stuff here later
    }
}

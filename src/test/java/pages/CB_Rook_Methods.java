package pages;

public class CB_Rook_Methods extends CB_Methods {
    public static void rook_Activate() {
        boolean test= true ;
        do{
        if (Piece01_X == Piece02_X || Piece01_Y == Piece02_Y ){
            test = !cross_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);
            //if ( ){}

        }else{
            System.out.println("invalid move ");
        }
        }while(test);
        //return answer;
        // will add castling stuff here later
    }
}

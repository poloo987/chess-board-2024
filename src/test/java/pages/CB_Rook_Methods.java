package pages;

public class CB_Rook_Methods extends CB_Methods {
    public static Boolean rook_Activate() {
        boolean rookActTest= true ;

        if (Piece01_X == Piece02_X || Piece01_Y == Piece02_Y ){
            rookActTest = cross_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);
            if (rookActTest == false ){
                System.out.println("invalid move - rooks is blocked by a Piece ");
            }
        }else{
            System.out.println("invalid move - move is not in the rooks range ");
            rookActTest = false;
        }

        return rookActTest;
        // will add castling stuff here later
    }
}

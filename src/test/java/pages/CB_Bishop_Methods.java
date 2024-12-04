package pages;

public class CB_Bishop_Methods extends CB_Methods {
    public static Boolean bishop_Activate() {
            boolean bishopActTest= true ;
            try{
                int slope = ((Piece02_Y-Piece01_Y)/((-1*Piece02_X )-(-1*Piece01_X)));
                if (slope == 1 || slope==-1 ){
                diag_Mvt_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y);// testing 11/23
                }else{
                 System.out.println("invalid move - out of range");
                    bishopActTest = false;
                }
            }catch (ArithmeticException ae){ // <---I need to test this catch  , but I don't know how
                System.out.println("invalid move -div by zero ");
                bishopActTest = false;
            }
            return bishopActTest;
        }

    }

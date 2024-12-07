package pages;



public class CB_Knight_Methods extends CB_Methods {
    public static boolean knight_Activate() {
        boolean knightActTest= true ;
        if (knight_Rom_Check(Piece01_X,Piece01_Y,Piece02_X,Piece02_Y)){
            if (last_Space_Check(Piece02_X+1, Piece02_Y+1,Piece01_X+1)){  // add to
            knightActTest = true ;
            }else {
            knightActTest = false ;
            }
        }else {
            knightActTest = false ;
        }

        return knightActTest;
    }

    public static boolean knight_Rom_Check(int Piece01_X, int Piece01_Y, int Piece02_X, int Piece02_Y){
        boolean knightRomAnswer= true ;
        if(Piece01_X+1 == Piece02_X && Piece01_Y-2 == Piece02_Y){ // up left move
            System.out.println("in range");
        }else if(Piece01_X-1 == Piece02_X && Piece01_Y-2 == Piece02_Y){// up right move
            System.out.println("in range");
        }else if(Piece01_X+2 == Piece02_X && Piece01_Y-1== Piece02_Y){// right up move
            System.out.println("in range");
        }else if(Piece01_X+2 == Piece02_X && Piece01_Y+1== Piece02_Y){// right down move
            System.out.println("in range");
        }else if(Piece01_X+1 == Piece02_X && Piece01_Y+2== Piece02_Y){//  down right move
            System.out.println("in range");
        }else if(Piece01_X-1 == Piece02_X && Piece01_Y+2== Piece02_Y){//  down left move
            System.out.println("in range");
        }else if(Piece01_X-2 == Piece02_X && Piece01_Y+1== Piece02_Y){//   left down move
            System.out.println("in range");
        }else if(Piece01_X-2 == Piece02_X && Piece01_Y-1== Piece02_Y){// left up move

        }else{System.out.println("invalid move- out of knight's range");knightRomAnswer= false;}


        return knightRomAnswer;
    }

}

package pages;



public class CB_Knight_Methods extends CB_Methods {
    public static void knight_Activate() {
    if(Piece01_X+1 == Piece02_X && Piece01_Y-2 == Piece02_Y){ // up left move
        System.out.println("pass - move Knight");
       // new_Block_Check(Piece02_X,Piece02_Y);// will add when "teams" has been coded
    }else if(Piece01_X-1 == Piece02_X && Piece01_Y-2 == Piece02_Y){// up right move
        System.out.println("pass - move Knight");
        // new_Block_Check(Piece02_X,Piece02_Y);//
    }else if(Piece01_X+2 == Piece02_X && Piece01_Y-1== Piece02_Y){// right up move
            System.out.println("pass - move Knight");
            // new_Block_Check(Piece02_X,Piece02_Y);//
        }else if(Piece01_X+2 == Piece02_X && Piece01_Y+1== Piece02_Y){// right down move
            System.out.println("pass - move Knight");
            // new_Block_Check(Piece02_X,Piece02_Y);//
        }else if(Piece01_X+1 == Piece02_X && Piece01_Y+2== Piece02_Y){//  down right move
        System.out.println("pass - move Knight");
        // new_Block_Check(Piece02_X,Piece02_Y);//
    }else if(Piece01_X-1 == Piece02_X && Piece01_Y+2== Piece02_Y){//  down left move
        System.out.println("pass - move Knight");
        // new_Block_Check(Piece02_X,Piece02_Y);//
    }else if(Piece01_X-2 == Piece02_X && Piece01_Y+1== Piece02_Y){//   left down move
            System.out.println("pass - move Knight");
            // new_Block_Check(Piece02_X,Piece02_Y);//
        }else if(Piece01_X-2 == Piece02_X && Piece01_Y-1== Piece02_Y){// left up move
            System.out.println("pass - move Knight");
            // new_Block_Check(Piece02_X,Piece02_Y);//
        }else{System.out.println("invalid move");}



    }


}

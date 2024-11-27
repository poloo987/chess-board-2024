package pages;

public class CB_GameBoard extends CB_Methods {

    /* */
    static CB_Pawn_Methods getPawn = new CB_Pawn_Methods();
    static CB_Rook_Methods getRook = new CB_Rook_Methods();
    static CB_Knight_Methods getKnight = new CB_Knight_Methods();
    static CB_Bishop_Methods getBishop = new CB_Bishop_Methods();
    static CB_Queen_Methods getQueen = new CB_Queen_Methods();
    static CB_King_Methods getKing = new CB_King_Methods();

    static String [][] Chessborad = {//
                 /* A */ /* B */   /* C */   /* D */  /* E */ /* F */   /* G */   /* H */
     /* 1 */    {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight",  "Rook"},
     /* 2 */    {"Pawn", "Pawn",   "Pawn",   "Pawn",  "Pawn", "Pawn",   "Pawn",    "Pawn"},
     /* 3 */    {"-000-","-000-",  "-000-",  "-000-", "-000-","-000-",  "-000-",  "-000-"},
     /* 4 */    {"-000-","-000-",  "-000-",  "-000-", "-000-","-000-",  "-000-",  "-000-"},
     /* 5 */    {"-000-","-000-",  "-000-",  "Rook", "-000-","-000-",  "Pawn",  "-000-"},
     /* 6 */    {"-000-","-000-",  "-000-",  "-000-", "-000-","-000-",  "-000-",  "-000-"},
     /* 7 */    {"Pawn", "Pawn",   "Pawn",   "-000-",  "Pawn", "Pawn",   "Pawn",    "Pawn"},
     /* 8 */    {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight",  "Rook"}


    };
    public static void select_Piece()  {


        System.out.println("what piece do you want to move? input coordinate (A-H,1-8) ex:A2");
        answer = User_answer.nextLine();
        answer = getAnswerCheck(answer);

        Piece01_X = getCoord_X();//A
        Piece01_Y = getCoord_Y();//2
        PieceMain_01 = Chessborad [Piece01_Y][Piece01_X];
        //check_Team(); makes sure that PieceMain_01 in yours
        //do{}
        System.out.println("where do want to move it? ?");
        answer = User_answer.nextLine();
        answer = getAnswerCheck(answer);
        Piece02_X = getCoord_X();//A
        Piece02_Y = getCoord_Y();//3
        PieceMain_02 = Chessborad [Piece02_Y][Piece02_X];
        check_movement();

        System.out.println("end");// don't for get to close your image so the program closes
    }
}





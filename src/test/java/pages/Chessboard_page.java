package pages;

public class Chessboard_page extends CB_Methods {

    /* */
    static CB_Pawn_Methods getPawn = new CB_Pawn_Methods();

    static String [][] Chessborad = { // will need to program the diff in black and white pieces
            {"Rook", "Knight", "Bishop ", "Queen", "King", "Bishop", "Knight", "Rook"},
            {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"},
            {"-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-"},
            {"-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-"},
            {"-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-"},
            {"-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-", "-000-"},
            {"Pawn","Pawn","Pawn", "Pawn","Pawn","Pawn","Pawn","Pawn"},
            {"Rook", "Knight", "Bishop ", "Queen", "King", "Bishop", "Knight", "Rook"},
    };
    public static void select_Piece() { // might add ( i forgot )  , // if there is time we can add a check for the char and a to upper case

        System.out.println("what pice do you want to move ?");
        answer = User_answer.nextLine();
        Piece01_Y = getCoord_X();
        Piece01_X = getCoord_y();
        PieceMain_01 = Chessborad [Piece01_Y][Piece01_X];

        System.out.println("where do want to move it? ?");
        answer = User_answer.nextLine();
        Piece02_X = getCoord_X();
        Piece02_Y = getCoord_y();
        PieceMain_02 = Chessborad [Piece02_X][Piece02_Y];
       // Chessborad [Piece01_X][Piece01_Y]=Chessborad [Piece02_X][Piece02_Y];
        check_movement();
    }

    public static void check_movement() {
        System.out.println("checking movement");
        switch (PieceMain_01) {
            case "Pawn":
                getPawn.pawn_Activate();
                break;
        }
    }

    public static Integer getCoord_X() {
        char yChar = answer.charAt(1);
        Coord_X = Character.getNumericValue(yChar) -1;
        return Coord_X;

    }

    public static Integer getCoord_y() {
        char letter_Char = answer.charAt(0);
        letter_Char = Character.toUpperCase(letter_Char);
        switch (letter_Char) {
            case 'A':
                Coord_Y = 0;
                break;
            case 'B':
                Coord_Y = 1;
                break;
            case 'C':
                Coord_Y = 2;
                break;
            case 'D':
                Coord_Y = 3;
                break;
            case 'E':
                Coord_Y = 4;
                break;
            case 'F':
                Coord_Y = 5;
                break;
            case 'G':
                Coord_Y = 6;
                break;
            case 'H':
                Coord_Y = 7;
                break;

        }
        return Coord_Y;
    }
}





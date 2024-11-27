package pages;

import java.util.Scanner;




    // Enum for Piece colors
    enum Color {
        WHITE, BLACK
    }

    // Abstract Piece class
    abstract class Piece {
        protected Color color;

        public Piece(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        public abstract boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board);
        public abstract String getSymbol();
    }

    // Concrete classes for each chess piece
    class Pawn extends Piece {
        public Pawn(Color color) {
            super(color);
        }

        @Override
        public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
            // Simplified Pawn movement (no special rules like En Passant or promotion)
            int direction = (color == Color.WHITE) ? 1 : -1;
            if (startX == endX) {
                return (endY - startY == direction); // Move forward one square
            }
            return false;
        }

        @Override
        public String getSymbol() {
            return color == Color.WHITE ? "P" : "p";
        }
    }

    class Rook extends Piece {
        public Rook(Color color) {
            super(color);
        }

        @Override
        public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
            // Rooks move in straight lines: horizontally or vertically
            return startX == endX || startY == endY;
        }

        @Override
        public String getSymbol() {
            return color == Color.WHITE ? "R" : "r";
        }
    }

    class Knight extends Piece {
        public Knight(Color color) {
            super(color);
        }

        @Override
        public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
            // Knights move in an L shape
            return (Math.abs(startX - endX) == 2 && Math.abs(startY - endY) == 1) ||
                    (Math.abs(startX - endX) == 1 && Math.abs(startY - endY) == 2);
        }

        @Override
        public String getSymbol() {
            return color == Color.WHITE ? "N" : "n";
        }
    }

    class Bishop extends Piece {
        public Bishop(Color color) {
            super(color);
        }

        @Override
        public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
            // Bishops move diagonally
            return Math.abs(startX - endX) == Math.abs(startY - endY);
        }

        @Override
        public String getSymbol() {
            return color == Color.WHITE ? "B" : "b";
        }
    }

    class Queen extends Piece {
        public Queen(Color color) {
            super(color);
        }

        @Override
        public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
            // Queens move like both a Rook and a Bishop
            return (startX == endX || startY == endY || Math.abs(startX - endX) == Math.abs(startY - endY));
        }

        @Override
        public String getSymbol() {
            return color == Color.WHITE ? "Q" : "q";
        }
    }

    class King extends Piece {
        public King(Color color) {
            super(color);
        }

        @Override
        public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
            // Kings move one square in any direction
            return Math.abs(startX - endX) <= 1 && Math.abs(startY - endY) <= 1;
        }

        @Override
        public String getSymbol() {
            return color == Color.WHITE ? "K" : "k";
        }
    }

    // Board class
    class ChessBoard {
        private Piece[][] board;

        public ChessBoard() {
            board = new Piece[8][8];
            setupBoard();
        }

        private void setupBoard() {
            // Setup Pawns
            for (int i = 0; i < 8; i++) {
                board[1][i] = new Pawn(Color.WHITE);
                board[6][i] = new Pawn(Color.BLACK);
            }

            // Setup Rooks
            board[0][0] = board[0][7] = new Rook(Color.WHITE);
            board[7][0] = board[7][7] = new Rook(Color.BLACK);

            // Setup Knights
            board[0][1] = board[0][6] = new Knight(Color.WHITE);
            board[7][1] = board[7][6] = new Knight(Color.BLACK);

            // Setup Bishops
            board[0][2] = board[0][5] = new Bishop(Color.WHITE);
            board[7][2] = board[7][5] = new Bishop(Color.BLACK);

            // Setup Queens
            board[0][3] = new Queen(Color.WHITE);
            board[7][3] = new Queen(Color.BLACK);

            // Setup Kings
            board[0][4] = new King(Color.WHITE);
            board[7][4] = new King(Color.BLACK);
        }

        public Piece getPiece(int x, int y) {
            return board[x][y];
        }

        public void movePiece(int startX, int startY, int endX, int endY) {
            Piece piece = board[startX][startY];
            if (piece != null && piece.isValidMove(startX, startY, endX, endY, this)) {
                board[endX][endY] = piece;
                board[startX][startY] = null;
            }
        }

        public void printBoard() {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == null) {
                        System.out.print(". ");
                    } else {
                        System.out.print(board[i][j].getSymbol() + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    // Main game class

    public class gpt_code {
        public static ChessBoard chessBoard;
        public static boolean whiteTurn;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            chessBoard = new ChessBoard();
            whiteTurn = true;

            while (true) {
                chessBoard.printBoard();
                System.out.println((whiteTurn ? "White" : "Black") + "'s turn");
                System.out.print("Enter move (e.g., e2 e4): ");
                String move = scanner.nextLine();

                String[] parts = move.split(" ");
                if (parts.length != 2) {
                    System.out.println("Invalid move format.");
                    continue;
                }

                String start = parts[0];
                String end = parts[1];

                int startX = 8 - Integer.parseInt(start.substring(1));
                int startY = start.charAt(0) - 'a';
                int endX = 8 - Integer.parseInt(end.substring(1));
                int endY = end.charAt(0) - 'a';

                Piece piece = chessBoard.getPiece(startX, startY);

                if (piece == null || piece.getColor() != (whiteTurn ? Color.WHITE : Color.BLACK)) {
                    System.out.println("Invalid piece or it's the wrong turn.");
                    continue;
                }

                chessBoard.movePiece(startX, startY, endX, endY);
                whiteTurn = !whiteTurn;
            }
        }
    }



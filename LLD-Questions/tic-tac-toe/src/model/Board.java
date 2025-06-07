package model;

public class Board {
  
  public int size;
  public PlayingPiece[][] board;
  
  public Board(int size) {
    this.size = size;
    this.board = new PlayingPiece[size][size];
  }
  
  public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
    
    if(board[row][column] != null) {
      return false;
    }
    board[row][column] = playingPiece;
    return true;
  }
  
  public boolean hasFreeSpace() {
    
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] == null) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void printBoard() {
    
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] != null) {
          System.out.print(board[i][j].type.name() + "   ");
        } else {
          System.out.print("    ");
          
        }
        System.out.print(" | ");
      }
      System.out.println();
      
    }
  }
}

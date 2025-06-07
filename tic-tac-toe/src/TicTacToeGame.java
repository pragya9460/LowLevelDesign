import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import model.Board;
import model.PieceType;
import model.Player;
import model.PlayingPieceO;
import model.PlayingPieceX;

public class TicTacToeGame {
  
  Deque<Player> players;
  Board gameBoard;
  
  TicTacToeGame() {
    initGame();
  }
  
  public void initGame() {
    players = new LinkedList<>();
    
    PlayingPieceX pieceX = new PlayingPieceX();
    players.add(new Player("Player 1", pieceX));
    
    PlayingPieceO pieceO = new PlayingPieceO();
    players.add(new Player("Player 2", pieceO));
    
    gameBoard = new Board(3);
  }
  
  public String startGame() {
    boolean noWinner = true;
    while (noWinner) {
      
      Player playerTurn = players.removeFirst();
      
      gameBoard.printBoard();
      if(!gameBoard.hasFreeSpace()) {
        return "No winner";
      }
      
      System.out.print("Player: " + playerTurn.getName() + " Enter row,column: ");
      Scanner inputScanner = new Scanner(System.in);
      String s = inputScanner.nextLine();
      String[] values = s.split(",");
      int inputRow = Integer.valueOf(values[0]);
      int inputColumn = Integer.valueOf(values[1]);
      
      boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.getPiece());
      if(!pieceAddedSuccessfully) {
        //player can not insert the piece into this cell, player has to choose another cell
        System.out.println("Incorrect position chosen, try again");
        players.addFirst(playerTurn);
        continue;
      }
      players.addLast(playerTurn);
      
      boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPiece().type);
      if(winner) {
        return playerTurn.getName();
      }
    }
    
    return "No winner";
  }
  
  public boolean isThereWinner(int row, int column, PieceType pieceType) {
    
    boolean rowMatch = true;
    boolean columnMatch = true;
    boolean diagonalMatch = true;
    boolean antiDiagonalMatch = true;
    
    //need to check in row
    for(int i=0; i<gameBoard.size; i++) {
      
      if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType) {
        rowMatch = false;
      }
    }
    
    //need to check in column
    for(int i=0; i<gameBoard.size; i++) {
      
      if(gameBoard.board[i][column] == null || gameBoard.board[i][column].type != pieceType) {
        columnMatch = false;
      }
    }
    
    //need to check diagonals
    for(int i=0, j=0; i<gameBoard.size; i++,j++) {
      if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
        diagonalMatch = false;
      }
    }
    
    //need to check anti-diagonals
    for(int i=0, j=gameBoard.size-1; i<gameBoard.size; i++,j--) {
      if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
        antiDiagonalMatch = false;
      }
    }
    
    return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
  }
}


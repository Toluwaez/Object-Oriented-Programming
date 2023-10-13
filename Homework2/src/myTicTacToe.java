import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;

public class myTicTacToe implements cs331TicTacToeGame{
    cs331TicTacToeBoard board;
    cs331TicTacToeController controller;
    cs331TicTacToeFrame frame;
    private Players player1; 
    private Players player2;

    public myTicTacToe(){
        this.frame = new cs331TicTacToeFrame(null);
        this.controller = new cs331TicTacToeController();

        //Instantiate the cs331TicTacToeBoard
        this.board = new cs331TicTacToeBoard();

        // Instantiate the Controller and set the initial message
        controller = new cs331TicTacToeController();

        //Instatiating the controller to set the message 
        controller.setControllerMessage("Select a square to start playing!");
    }
    @Override
    public void invalidSquareChosen(int arg0, int arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'invalidSquareChosen'");
    }

    @Override
    public void noWinner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("its a tie'");
    }

    @Override
    public void playerWins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playerWins'");
    }

    @Override
    public void restartGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restartGame'");
    }
    
}

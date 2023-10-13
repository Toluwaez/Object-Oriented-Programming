import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import cs331Helper.cs331TicTacToePlayer;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage stage){

        cs331TicTacToeFrame frame = new cs331TicTacToeFrame(stage);

         //This is to instantiate the Boards Object. 
         cs331TicTacToeBoard board = new cs331TicTacToeBoard();

          //This is for the instantiation of the control Object.
          cs331TicTacToeController control = new cs331TicTacToeController();

          //Displaying the Message "Sellect a square to start playing"
         control.setControllerMessage("Select a square to start playing!");

         

        // Add the game here to the frame: Look javadocs for cs331TicTacToeFrame  
        frame.addGame(null);

        Players player1 = new Players("X", control);
        Players player2 = new Players("O", control);
        control.addPlayer(player1);
        control.addPlayer(player2);
        
         
         //cs331TicTacToePlayer player1 = new cs331TicTacToePlayer();
            
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

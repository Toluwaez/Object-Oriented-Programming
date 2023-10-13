import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;

public class Players implements cs331TicTacToePlayer{

    private String icon;
    private cs331TicTacToeController controller;
    

    public Players(String icon, cs331TicTacToeController controller){
        if (icon.equals("X") || icon.equals("O")) {
            this.icon = icon;
        } else {
            throw new IllegalArgumentException("Invalid player icon. Use 'X' or 'O'.");
        }
        
        this.controller = controller;
        
    }
    public String getIcon(){
        return icon;
    }

    @Override
    public void selectSquare(int arg0, int arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectSquare'");
    }
    
}

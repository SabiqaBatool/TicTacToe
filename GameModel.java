package GUI;

public class GameModel {

    private int player1_score;
    private int player2_score;

    int winner()
    {
        if(player1_score>player2_score)
        {
            return 1; // player1 is winner
        }
        return 2; // player2 is winner
    }

}

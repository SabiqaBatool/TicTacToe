package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GameController {

   private View view;
   private GameModel model;

  public GameController(ActionListener view, GameModel model)
  {
      this.view = (View) view;
      this.model = model;
  }

  public int handleGame(int Score1, int Score2)
  {

          if(Score1>Score2)
          {
              return 1; // player1 is winner
          }
          return 2; // player2 is winner


  }

}

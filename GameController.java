package GUI;

import java.awt.event.ActionListener;

public class GameController {

   private View view;
   private GameModel model;

  public GameController(ActionListener view, GameModel model)
  {
      this.view = (View) view;
      this.model = model;
  }

  public void handleGame(int Score1, int Score2)
  {
     if(Score1>Score2)
     {

     }
  }

}

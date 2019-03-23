package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private JPanel panel1;
    private JButton button00;
    private JButton button01;
    private JButton button02;
    private JButton button20;
    private JButton button11;
    private JButton button12;
    private JButton button21;
    private JButton button22;
    private JButton button10;
    private JButton StartGame;
    private JButton FinishGame;
    private JPanel Start_Stop;
    private JPanel ScoreBoard;
    private JLabel Player2Result;
    private JLabel Player1Result;
    private JLabel Player2;
    private JLabel Player1;
    private JPanel ParentPanel;
    private GameController gameController;


    public View() {
        add(ParentPanel);
        setTitle("TicTacToe");
        setSize(500, 500);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        StartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button00.setBackground(Color.black);
                button01.setBackground(Color.black);
                button02.setBackground(Color.black);
                button10.setBackground(Color.black);
                button11.setBackground(Color.black);
                button12.setBackground(Color.black);
                button20.setBackground(Color.black);
                button21.setBackground(Color.black);
                button22.setBackground(Color.black);
                ButtonListners();
                // gameController = new GameController(this,new GameModel());
                //gameController.handleGame();

            }
        });

    }


    int total = 0;

    void ButtonListners() {
        button00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button00);
                FindWinner();
            }
        });

        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button01);
                FindWinner();
            }
        });

        button02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button02);
                FindWinner();
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button10);
                FindWinner();
            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button11);
                FindWinner();
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button12);
                FindWinner();
            }
        });

        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button20);
                FindWinner();
            }
        });

        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button21);
                FindWinner();
            }
        });

        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setImage(button22);
                FindWinner();
            }
        });

        FinishGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }


    void setImage(JButton jb) {
        jb.setSize(100, 100);
        if (total < 9) {
            if (total % 2 == 0) {
                jb.setText("Tick");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\sabiq\\IdeaProjects\\Assignment4\\src\\GUI\\tick.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                jb.setIcon(imageIcon);

            } else {
                jb.setText("Cross");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\sabiq\\IdeaProjects\\Assignment4\\src\\GUI\\cross.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                jb.setIcon(imageIcon);

            }
            total = total + 1;
        }
    }

    void FindWinner() {
        System.out.println("wertyt4r32");
        Boolean found = false;
        if (found != true) {
            if ((button00.getText() == button11.getText()) && (button00.getText() == button22.getText())) {
                if ((button00.getIcon() != null) && (button11.getIcon() != null) && (button22.getIcon() != null)) {
                    if ((button00.getText() == "Tick") && (button11.getText() == "Tick") && (button22.getText() == "Tick")) {
                        Player1Result.setText("1");
                    } else {
                        Player2Result.setText("1");

                    }
                }
            } else if ((button00.getText() == button01.getText()) && (button00.getText() == button02.getText())) {
                if ((button00.getIcon() != null) && (button01.getIcon() != null) && (button02.getIcon() != null)) {
                    if ((button00.getText() == "Tick") && (button01.getText() == "Tick") && (button02.getText() == "Tick")) {
                        Player1Result.setText("1");
                    } else {
                        Player2Result.setText("1");

                    }
                }
            } else if ((button00.getText() == button10.getText()) && (button00.getText() == button20.getText())) {
                if ((button00.getIcon() != null) && (button10.getIcon() != null) && (button20.getIcon() != null)) {
                    if ((button00.getText() == "Tick") && (button10.getText() == "Tick") && (button20.getText() == "Tick")) {
                        Player1Result.setText("1");
                    } else {
                        Player2Result.setText("1");

                    }
                }
            } else if ((button20.getText() == button21.getText()) && (button20.getText() == button22.getText())) {
                if ((button20.getIcon() != null) && (button21.getIcon() != null) && (button22.getIcon() != null)) {
                    if ((button20.getText() == "Tick") && (button21.getText() == "Tick") && (button22.getText() == "Tick")) {
                        Player1Result.setText("1");
                    } else {
                        Player2Result.setText("1");

                    }
                }
            } else if ((button02.getIcon() != null) && (button12.getIcon() != null) && (button22.getIcon() != null)) {
                if ((button02.getText() == button12.getText()) && (button12.getText() == button22.getText())) {
                    if ((button02.getText() == "Tick") && (button12.getText() == "Tick") && (button22.getText() == "Tick")) {
                        Player1Result.setText("1");
                    } else {
                        Player2Result.setText("1");

                    }
                }
            }
        } else if ((button10.getIcon() != null) && (button11.getIcon() != null) && (button12.getIcon() != null)) {
            if ((button10.getText() == button11.getText()) && (button11.getText() == button12.getText())) {
                if((button10.getText() == "Tick") && (button11.getText() == "Tick") && (button12.getText() == "Tick")){
                    Player1Result.setText("1");
                 }
                else {
                    Player2Result.setText("1");
                    }
            }
         }
        else {
            if ((button00.getIcon() != null) && (button01.getIcon() != null) && (button02.getIcon() != null) && (button10.getIcon() != null) && (button11.getIcon() != null) && (button12.getIcon() != null) && (button20.getIcon() != null) && (button21.getIcon() != null) && (button22.getIcon() != null)) {
                JOptionPane.showMessageDialog(null, "No one has brain");
            }
        }
    }



            //Player1Result.setText("1");


        @Override
        public void actionPerformed (ActionEvent e){


        }
    }

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;

public class Display extends JFrame {
    Random random = new Random();
    Game game = new Game();
    Game2 game2 = new Game2();
    Game3 game3 = new Game3();
    Game4 game4 = new Game4();
    int gameNum = random.nextInt(1,5);
    int nextGame = gameNum;
    private boolean con = true;
    public static String winner ;
    public Display(){
        setTitle("SnakeLadder");
        setResizable(false);
        setSize(1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu();
        setVisible(true);
        while(con) {
            System.out.println("");
            if(Game.winner() || Game2.winner() || Game3.winner() || Game4.winner()) {
                removeContent();
                if(Game.winner()) winner = Game.winnerCheck();
                else if(Game2.winner()) winner = Game2.winnerCheck();
                else if(Game3.winner()) winner = Game3.winnerCheck();
                else if(Game4.winner()) winner = Game4.winnerCheck();
                winner();
                setVisible(true);
                switch (nextGame){
                case 1: game.getCha1().setPositionCha1(1);game.getCha2().setPositionCha2(1);
                        break;
                case 2: game2.getCha1().setPositionCha1(1);game2.getCha2().setPositionCha2(1);
                        break;
                case 3: game3.getCha1().setPositionCha1(1);game3.getCha2().setPositionCha2(1);
                        break;
                case 4: game4.getCha1().setPositionCha1(1);game4.getCha2().setPositionCha2(1);
                        break;
                }
                
                continue;
            }
        }
  
    }
 
    public void winner(){
        Winner winner = new Winner();
        add(winner);
        JButton restart = new JButton("Restart");
        ActionListener listener = new ClickRestart();
        restart.addActionListener(listener);
        restart.setBounds(550, 500, 100, 50);
        winner.add(restart);
        winner.setVisible(true);
        setLocationRelativeTo(null);
    }
    public void menu(){
        Menu menu = new Menu();
        add(menu);
        menu.setVisible(true);
        ActionListener listener = new ClickStart();
        JButton start = new JButton();
        start.addActionListener(listener);
        start.setBounds(430,600,400,50);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        menu.add(start);
        setLocationRelativeTo(null);
    }
    
    public void game(){
        add(game);
        game.setVisible(true);
        setLocationRelativeTo(null);
    }
    public void game2(){
       add(game2);
       game2.setVisible(true);
       setLocationRelativeTo(null);
    }
    
    public void game3(){
       add(game3);
       game3.setVisible(true);
       setLocationRelativeTo(null);
    }
    
    public void game4(){
       add(game4);
       game4.setVisible(true);
       setLocationRelativeTo(null);
    }
    
    private void removeContent() {
		this.getContentPane().removeAll();
		this.getContentPane().repaint();
    }
    class ClickStart implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            removeContent();
            switch (gameNum){
                case 1: game();break;
                case 2: game2();break;
                case 3: game3();break;
                case 4: game4();break;
            }
            setVisible(true);
        }
    }
    class ClickRestart implements ActionListener{
        public void actionPerformed(ActionEvent e){
            removeContent();
            nextGame = random.nextInt(1,5);
            switch (nextGame){
                case 1: game();break;
                case 2: game2();break;
                case 3: game3();break;
                case 4: game4();break;
            }
            setVisible(true);
     
            
        }
    }
    public static void main(String[] arg){
        Display dis = new Display();
        
    }
}

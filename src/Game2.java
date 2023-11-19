import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import Element.Element;

public class Game2 extends JPanel {
    
    public static final int gWidth = 1200;
    public static final int gHeight = 800;
    private static Character character1 = new Character(90,690,30);
    private static Character character2 = new Character(60,730,30);
    Random random = new Random();
    private int roll = 1;
    private static int turn = 1;
    
    
    public Game2(){
        setPreferredSize(new Dimension(gWidth,gHeight));
        setLayout(null);
        JButton cubic = new JButton("Roll");
        cubic.setBounds(950, 600, 100, 50);
        add(cubic);
        ActionListener listener = new ClickListener();
        cubic.addActionListener(listener);
    }
    
    public static Character getCha1(){
        return character1;
    }
    public static Character getCha2(){
        return character2;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        try{
            g.drawImage(ImageIO.read(new File("src/bg.png")),0,0,1200,900,null);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            g.drawImage(ImageIO.read(new File("src/board2.png")),50,0,750,765,null);
        }
        catch(Exception e){
            System.out.println(e);
        }
        g.drawImage(character1.getImage(),character1.getX(),character1.getY(),character1.getSize(),
                character1.getSize(), null);
        g.drawImage(character2.getImage(),character2.getX(),character2.getY(),character2.getSize(),
                character2.getSize(),null);
        try{
            switch(roll){
                case 1: g.drawImage(ImageIO.read(new File("src/dice1.png")), 975, 530,50,50, null);break;
                case 2: g.drawImage(ImageIO.read(new File("src/dice2.png")), 975, 530,50,50, null);break;
                case 3: g.drawImage(ImageIO.read(new File("src/dice3.png")), 975, 530,50,50, null);break;
                case 4: g.drawImage(ImageIO.read(new File("src/dice4.png")), 975, 530,50,50, null);break;
                case 5: g.drawImage(ImageIO.read(new File("src/dice5.png")), 975, 530,50,50, null);break;
                case 6: g.drawImage(ImageIO.read(new File("src/dice6.png")), 975, 530,50,50, null);break;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        g.setFont(Element.getFont(30));
        g.drawString("This is P"+turn+" turn", 930, 500);
    }
    
    class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            if (turn == 1){
                roll = random.nextInt(1,7);
                int nextPosition = character1.getPosition()+roll;
                if(nextPosition == 37) nextPosition = 2;
                else if(nextPosition == 76) nextPosition = 61;
                else if(nextPosition == 46) nextPosition = 6;
                else if(nextPosition == 96) nextPosition = 54;
                else if(nextPosition == 14) nextPosition = 32;
                else if(nextPosition == 43) nextPosition = 59;
                else if(nextPosition == 73) nextPosition = 93;
                else if(nextPosition > 100) nextPosition = 100;
                character1.setPositionCha1(nextPosition);
                turn = 2;
                repaint();
            }
            else if(turn == 2){
                roll = random.nextInt(1,7);
                int nextPosition = character2.getPosition()+roll;
                if(nextPosition == 37) nextPosition = 2;
                else if(nextPosition == 76) nextPosition = 61;
                else if(nextPosition == 46) nextPosition = 6;
                else if(nextPosition == 96) nextPosition = 54;
                else if(nextPosition == 14) nextPosition = 32;
                else if(nextPosition == 43) nextPosition = 59;
                else if(nextPosition == 73) nextPosition = 93;
                else if(nextPosition > 100) nextPosition = 100;
                character2.setPositionCha2(nextPosition);
                turn = 1;
                repaint();
            }
           
        }
    }
    public static Boolean winner(){
        if(character1.getPosition() == 100 || character2.getPosition() == 100) return true;
        else return false;
    }
    
    public static String winnerCheck(){
        if(character1.getPosition() == 100) return "1";
        else if(character2.getPosition() == 100) return "2";
        else return "don't have winner";
    }
    
    
    
}

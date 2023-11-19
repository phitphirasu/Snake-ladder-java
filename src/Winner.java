import Element.Element;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Winner extends JPanel {
    public static final int gWidth = 1200;
    public static final int gHeight = 800;
    
    public Winner(){
        setPreferredSize(new Dimension(gWidth,gHeight));
        setLayout(null);
     
    }
    public void paint(Graphics g){
        super.paint(g);
        super.paint(g);
        try{
            g.drawImage(ImageIO.read(new File("src/bg.png")),0,0,1200,900,null);
        }
        catch(Exception e){
            System.out.println(e);
        }
        g.setFont(Element.getFont(70));
        switch(Display.winner){
            case "1": g.drawString("Winner is player 1", 400, 400);break;
            case "2": g.drawString("Winner is player 2", 400, 400);break;
            default: g.drawString("Winner is player 0", 400, 400);break;
        }
    }
    
}

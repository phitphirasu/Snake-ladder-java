import Element.Element;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Menu extends JPanel{
    public static final int gWidth = 1200;
    public static final int gHeight = 800;
    
    public Menu(){
        setPreferredSize(new Dimension(gWidth,gHeight));
        setLayout(null);
  
    }
    public void paint(Graphics g){
        super.paint(g);
        try{
            g.drawImage(ImageIO.read(new File("src/menu.png")),0,0,1200,900,null);
        }
        catch(Exception e){
            System.out.println(e);
        }
        g.setFont(Element.getFont(50));
        g.drawString("Click here to start", 430, 650);
    }
    
    
}

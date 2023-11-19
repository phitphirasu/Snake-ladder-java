import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class Character {
    private int x,y,charSize; //charSize = square
    private int position = 1;
    private static int count = 1;
    public Character(int x, int y,int charSize){
        this.x = x;
        this.y = y;
        this.charSize = charSize;
    }
   
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getSize(){
        return charSize;
    }
    public int getPosition(){
        return position;
    }
    public void setPositionCha1(int pos){
        this.position = pos;
       
        if(this.position/10 == 0 || this.position == 10){
            this.y = 690;
            if(this.position%10 == 1) this.x = 90;
            else if(this.position%10 == 2) this.x = 165;
            else if(this.position%10 == 3) this.x = 240;
            else if(this.position%10 == 4) this.x = 315;
            else if(this.position%10 == 5) this.x = 390;
            else if(this.position%10 == 6) this.x = 465;
            else if(this.position%10 == 7) this.x = 540;
            else if(this.position%10 == 8) this.x = 615;
            else if(this.position%10 == 9) this.x = 690;
            else if(this.position%10 == 0) this.x = 765;
        }
        else if(this.position/10 == 1 || this.position == 20){
            this.y = 615;
            if(this.position%10 == 1) this.x = 765;
            else if(this.position%10 == 2) this.x = 690;
            else if(this.position%10 == 3) this.x = 615;
            else if(this.position%10 == 4) this.x = 540;
            else if(this.position%10 == 5) this.x = 465;
            else if(this.position%10 == 6) this.x = 390;
            else if(this.position%10 == 7) this.x = 315;
            else if(this.position%10 == 8) this.x = 240;
            else if(this.position%10 == 9) this.x = 165;
            else if(this.position%10 == 0) this.x = 90;
        }
        else if(this.position/10 == 2 || this.position == 30){
            this.y = 540;
            if(this.position%10 == 1) this.x = 90;
            else if(this.position%10 == 2) this.x = 165;
            else if(this.position%10 == 3) this.x = 240;
            else if(this.position%10 == 4) this.x = 315;
            else if(this.position%10 == 5) this.x = 390;
            else if(this.position%10 == 6) this.x = 465;
            else if(this.position%10 == 7) this.x = 540;
            else if(this.position%10 == 8) this.x = 615;
            else if(this.position%10 == 9) this.x = 690;
            else if(this.position%10 == 0) this.x = 765;
        }
        else if(this.position/10 == 3 || this.position == 40){
            this.y = 465;
            if(this.position%10 == 1) this.x = 765;
            else if(this.position%10 == 2) this.x = 690;
            else if(this.position%10 == 3) this.x = 615;
            else if(this.position%10 == 4) this.x = 540;
            else if(this.position%10 == 5) this.x = 465;
            else if(this.position%10 == 6) this.x = 390;
            else if(this.position%10 == 7) this.x = 315;
            else if(this.position%10 == 8) this.x = 240;
            else if(this.position%10 == 9) this.x = 165;
            else if(this.position%10 == 0) this.x = 90;
        }
        else if(this.position/10 == 4 || this.position == 50){
            this.y = 390;
            if(this.position%10 == 1) this.x = 90;
            else if(this.position%10 == 2) this.x = 165;
            else if(this.position%10 == 3) this.x = 240;
            else if(this.position%10 == 4) this.x = 315;
            else if(this.position%10 == 5) this.x = 390;
            else if(this.position%10 == 6) this.x = 465;
            else if(this.position%10 == 7) this.x = 540;
            else if(this.position%10 == 8) this.x = 615;
            else if(this.position%10 == 9) this.x = 690;
            else if(this.position%10 == 0) this.x = 765;
        }
        else if(this.position/10 == 5 || this.position == 60){
            this.y = 315;
            if(this.position%10 == 1) this.x = 765;
            else if(this.position%10 == 2) this.x = 690;
            else if(this.position%10 == 3) this.x = 615;
            else if(this.position%10 == 4) this.x = 540;
            else if(this.position%10 == 5) this.x = 465;
            else if(this.position%10 == 6) this.x = 390;
            else if(this.position%10 == 7) this.x = 315;
            else if(this.position%10 == 8) this.x = 240;
            else if(this.position%10 == 9) this.x = 165;
            else if(this.position%10 == 0) this.x = 90;
        }
        else if(this.position/10 == 6 || this.position == 70){
            this.y = 240;
            if(this.position%10 == 1) this.x = 90;
            else if(this.position%10 == 2) this.x = 165;
            else if(this.position%10 == 3) this.x = 240;
            else if(this.position%10 == 4) this.x = 315;
            else if(this.position%10 == 5) this.x = 390;
            else if(this.position%10 == 6) this.x = 465;
            else if(this.position%10 == 7) this.x = 540;
            else if(this.position%10 == 8) this.x = 615;
            else if(this.position%10 == 9) this.x = 690;
            else if(this.position%10 == 0) this.x = 765;
        }
        else if(this.position/10 == 7 || this.position == 80){
            this.y = 165;
            if(this.position%10 == 1) this.x = 765;
            else if(this.position%10 == 2) this.x = 690;
            else if(this.position%10 == 3) this.x = 615;
            else if(this.position%10 == 4) this.x = 540;
            else if(this.position%10 == 5) this.x = 465;
            else if(this.position%10 == 6) this.x = 390;
            else if(this.position%10 == 7) this.x = 315;
            else if(this.position%10 == 8) this.x = 240;
            else if(this.position%10 == 9) this.x = 165;
            else if(this.position%10 == 0) this.x = 90;
        }
        else if(this.position/10 == 8 || this.position == 90){
            this.y = 90;
            if(this.position%10 == 1) this.x = 90;
            else if(this.position%10 == 2) this.x = 165;
            else if(this.position%10 == 3) this.x = 240;
            else if(this.position%10 == 4) this.x = 315;
            else if(this.position%10 == 5) this.x = 390;
            else if(this.position%10 == 6) this.x = 465;
            else if(this.position%10 == 7) this.x = 540;
            else if(this.position%10 == 8) this.x = 615;
            else if(this.position%10 == 9) this.x = 690;
            else if(this.position%10 == 0) this.x = 765;
        }
        else if(this.position/10 == 9 || this.position == 100){
            this.y = 15;
            if(this.position%10 == 1) this.x = 765;
            else if(this.position%10 == 2) this.x = 690;
            else if(this.position%10 == 3) this.x = 615;
            else if(this.position%10 == 4) this.x = 540;
            else if(this.position%10 == 5) this.x = 465;
            else if(this.position%10 == 6) this.x = 390;
            else if(this.position%10 == 7) this.x = 315;
            else if(this.position%10 == 8) this.x = 240;
            else if(this.position%10 == 9) this.x = 165;
            else if(this.position%10 == 0) this.x = 90;
        }
    }
    public void setPositionCha2(int pos){
        this.position = pos;
            
        if(this.position/10 == 0 || this.position == 10){
            this.y = 730;
            if(this.position%10 == 1) this.x = 60;
            else if(this.position%10 == 2) this.x = 135;
            else if(this.position%10 == 3) this.x = 210;
            else if(this.position%10 == 4) this.x = 285;
            else if(this.position%10 == 5) this.x = 360;
            else if(this.position%10 == 6) this.x = 435;
            else if(this.position%10 == 7) this.x = 510;
            else if(this.position%10 == 8) this.x = 585;
            else if(this.position%10 == 9) this.x = 660;
            else if(this.position%10 == 0) this.x = 735;
        }
        else if(this.position/10 == 1 || this.position == 20){
            this.y = 655;
            if(this.position%10 == 1) this.x = 735;
            else if(this.position%10 == 2) this.x = 660;
            else if(this.position%10 == 3) this.x = 585;
            else if(this.position%10 == 4) this.x = 510;
            else if(this.position%10 == 5) this.x = 435;
            else if(this.position%10 == 6) this.x = 360;
            else if(this.position%10 == 7) this.x = 285;
            else if(this.position%10 == 8) this.x = 210;
            else if(this.position%10 == 9) this.x = 135;
            else if(this.position%10 == 0) this.x = 60;
        }
        else if(this.position/10 == 2 || this.position == 30){
            this.y = 580;
            if(this.position%10 == 1) this.x = 60;
            else if(this.position%10 == 2) this.x = 135;
            else if(this.position%10 == 3) this.x = 210;
            else if(this.position%10 == 4) this.x = 285;
            else if(this.position%10 == 5) this.x = 360;
            else if(this.position%10 == 6) this.x = 435;
            else if(this.position%10 == 7) this.x = 510;
            else if(this.position%10 == 8) this.x = 585;
            else if(this.position%10 == 9) this.x = 660;
            else if(this.position%10 == 0) this.x = 735;
        }
        else if(this.position/10 == 3 || this.position == 40){
            this.y = 505;
            if(this.position%10 == 1) this.x = 735;
            else if(this.position%10 == 2) this.x = 660;
            else if(this.position%10 == 3) this.x = 585;
            else if(this.position%10 == 4) this.x = 510;
            else if(this.position%10 == 5) this.x = 435;
            else if(this.position%10 == 6) this.x = 360;
            else if(this.position%10 == 7) this.x = 285;
            else if(this.position%10 == 8) this.x = 210;
            else if(this.position%10 == 9) this.x = 135;
            else if(this.position%10 == 0) this.x = 60;
        }
        else if(this.position/10 == 4 || this.position == 50){
            this.y = 430;
            if(this.position%10 == 1) this.x = 60;
            else if(this.position%10 == 2) this.x = 135;
            else if(this.position%10 == 3) this.x = 210;
            else if(this.position%10 == 4) this.x = 285;
            else if(this.position%10 == 5) this.x = 360;
            else if(this.position%10 == 6) this.x = 435;
            else if(this.position%10 == 7) this.x = 510;
            else if(this.position%10 == 8) this.x = 585;
            else if(this.position%10 == 9) this.x = 660;
            else if(this.position%10 == 0) this.x = 735;
        }
        else if(this.position/10 == 5 || this.position == 60){
            this.y = 355;
            if(this.position%10 == 1) this.x = 735;
            else if(this.position%10 == 2) this.x = 660;
            else if(this.position%10 == 3) this.x = 585;
            else if(this.position%10 == 4) this.x = 510;
            else if(this.position%10 == 5) this.x = 435;
            else if(this.position%10 == 6) this.x = 360;
            else if(this.position%10 == 7) this.x = 285;
            else if(this.position%10 == 8) this.x = 210;
            else if(this.position%10 == 9) this.x = 135;
            else if(this.position%10 == 0) this.x = 60;
        }
        else if(this.position/10 == 6 || this.position == 70){
            this.y = 280;
            if(this.position%10 == 1) this.x = 60;
            else if(this.position%10 == 2) this.x = 135;
            else if(this.position%10 == 3) this.x = 210;
            else if(this.position%10 == 4) this.x = 285;
            else if(this.position%10 == 5) this.x = 360;
            else if(this.position%10 == 6) this.x = 435;
            else if(this.position%10 == 7) this.x = 510;
            else if(this.position%10 == 8) this.x = 585;
            else if(this.position%10 == 9) this.x = 660;
            else if(this.position%10 == 0) this.x = 735;
        }
        else if(this.position/10 == 7 || this.position == 80){
            this.y = 205;
            if(this.position%10 == 1) this.x = 735;
            else if(this.position%10 == 2) this.x = 660;
            else if(this.position%10 == 3) this.x = 585;
            else if(this.position%10 == 4) this.x = 510;
            else if(this.position%10 == 5) this.x = 435;
            else if(this.position%10 == 6) this.x = 360;
            else if(this.position%10 == 7) this.x = 285;
            else if(this.position%10 == 8) this.x = 210;
            else if(this.position%10 == 9) this.x = 135;
            else if(this.position%10 == 0) this.x = 60;
        }
        else if(this.position/10 == 8 || this.position == 90){
            this.y = 125;
            if(this.position%10 == 1) this.x = 60;
            else if(this.position%10 == 2) this.x = 135;
            else if(this.position%10 == 3) this.x = 210;
            else if(this.position%10 == 4) this.x = 285;
            else if(this.position%10 == 5) this.x = 360;
            else if(this.position%10 == 6) this.x = 435;
            else if(this.position%10 == 7) this.x = 510;
            else if(this.position%10 == 8) this.x = 585;
            else if(this.position%10 == 9) this.x = 660;
            else if(this.position%10 == 0) this.x = 735;
        }
        else if(this.position/10 == 9 || this.position == 100){
            this.y = 50;
            if(this.position%10 == 1) this.x = 735;
            else if(this.position%10 == 2) this.x = 660;
            else if(this.position%10 == 3) this.x = 585;
            else if(this.position%10 == 4) this.x = 510;
            else if(this.position%10 == 5) this.x = 435;
            else if(this.position%10 == 6) this.x = 360;
            else if(this.position%10 == 7) this.x = 285;
            else if(this.position%10 == 8) this.x = 210;
            else if(this.position%10 == 9) this.x = 135;
            else if(this.position%10 == 0) this.x = 60;
        }
    }
    public BufferedImage getImage(){
        BufferedImage image = null;
        if(count%2 == 1){
            try{
            image = ImageIO.read(new File("src/cha1.png"));
            return image;
            } 
            catch(Exception e){
            e.printStackTrace();
            }
            finally{
                count++;
            }
        }
        else if(count%2 == 0){
            try{
            image = ImageIO.read(new File("src/cha2.png"));
            return image;
            } 
            catch(Exception e){
            e.printStackTrace();
            }
            finally{
                count++;
            }
        }
        return image;
    }
}

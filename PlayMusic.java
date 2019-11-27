import java.applet.Applet;
import java.awt.*;


public class PlayMusic extends Applet {

    public void init() {
        
    }
    
    public void paint(Graphics g)
    {
        Color c = new Color(250,80,0) ;
        
        int x[]={200,200,350};
        int y[]={250,450,350};
        int n=3;
      
        g.setColor(c);
        g.fillPolygon(x,y,n);
        
        g.setColor(Color.orange);
        g.fillOval(210, 285, 115, 115);
        
        g.setColor(c);
        g.fillOval(223, 298, 90, 90);
        
        g.setColor(Color.white);
        g.fillRect(263, 315, 5, 50);
        g.fillOval(248, 352, 20, 20);
        //g.fillRect(265, 315, 15, 10);
        g.fillRoundRect(263, 314, 20, 10, 2, 2);
        //g.fillArc(600 , 550, 100, 100, 90, 220);
    }

    
}
/*<applet code="PlayMusic.class" ,width='300',height='300'>
</applet>
*/
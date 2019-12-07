/**
* @author Shashank Sahu 
*/
import java.awt.*;
class Earth{
    
    float x;//x-corrdinate of center of earth
    float y;//y-corrdinate of center of earth
    float radius=330;// radius of earth
    float mass=100000;// mass of earth relative to ball's mass
    
    public Earth(float x,float y){
        this.x=x;
        this.y=y;
    }
    
    public void paint(Graphics g){
       g.setColor(Color.GREEN);
       drawCircle(g);
       //drawing a red dot at the center of the earth
       g.setColor(Color.RED);
       g.fillOval((int)x-2,(int)y-2,4,4);
    }
    
    public void drawCircle(Graphics g){
        //Draws our earth
        int offsetX=(int)(x-radius);
        int offsetY=(int)(y-radius);
        int diameter=(int)(2*radius);
        g.fillOval(offsetX,offsetY,diameter,diameter);
    }
}

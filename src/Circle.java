import java.util.*;
import java.util.random.RandomGenerator;
public class Circle {
    protected Point centre;
    protected double R;
    Circle(){
        this.R=Math.random()*10+1;
        centre=new Point();
    }
    Circle(double x,double y){
        this.R=Math.random()*10+1;
        centre=new Point(x,y);
    }
    public boolean isOnCircle(Point p){
        if(p.x*p.x+p.y*p.y==R*R){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return ("x="+String.valueOf(this.centre.x)+" y="+String.valueOf(this.centre.y)+" R="+this.R);
    }
}
import java.sql.Array;
import java.util.Scanner;

public class Tester {
    protected int quantity;
    protected Circle array[];
    Tester(int n){
        Scanner c= new Scanner(System.in);
        array=new Circle[n];
        double x,y,R;
        System.out.println("Input elements' centre coordinates (radius is random)");
        for (int i=0;i<n;i++){
            x=c.nextDouble();
            y=c.nextDouble();
            array[i]=new Circle(x,y);

        }
        this.quantity=n;
    }
    public Circle findMax(){
        Circle max=array[0];
        for (int i=0;i<quantity;i++){
            if(max.R<array[i].R){
                max=array[i];
            }
        }
        return max;
    }
    public Circle findMin(){
        Circle min=array[0];
        for (int i=0;i<quantity;i++){
            if(min.R>array[i].R){
                min=array[i];
            }
        }
        return min;
    }

    public void output(){
        for (int i=0;i<this.quantity;i++){
            System.out.println(array[i]);
        }
    }


}
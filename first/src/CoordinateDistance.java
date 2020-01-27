/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;

/**
 *
 * @author Nishan Thapa
 */
public class CoordinateDistance {
    public static void main(String args[]){
        Coordinates axis=new Coordinates();
        double distance;
        double a;
        double b;
        axis.x1=4;
        axis.y1=2;
        
        Coordinates axixs=new Coordinates();
        axixs.x1=5;
        axixs.y1=2;
        
        System.out.println("Now finding the distance:");
        System.out.println("-------------------------");
        distance=Math.sqrt(Math.pow((axixs.x1-axis.x1),2)+Math.pow((axixs.y1-axis.y1),2));
        System.out.println("distance="+distance);
    }
}
class Coordinates{
    double x1;
    double y1;
}
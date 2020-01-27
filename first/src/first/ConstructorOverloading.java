/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first;
/**
 *
 * @author KIST
 */
class Point{
    double x;
    double y;
    Point(){
        this.x=1.0;
        this.y=3.0;
    }
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
}
public class ConstructorOverloading {
    public static void main(String args[]){
        Point obj=new Point();
        Point obj2=new Point();
        System.out.println("co-ordinate:"+obj.x+" "+obj.y);
        System.out.println("co-ordinat:"+obj2.x+" "+obj2.y);
        
    }
    
}

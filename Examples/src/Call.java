
import java.util.Scanner;

abstract class Shape{
       abstract double getArea();
        }
class Rectangle extends Shape{
    int length;
    int breadth;   
    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;         
    }   
    double getArea(){
        //System.out.println("Area of Rectangle");
        return length*breadth;
    }    
}
class Circle extends Shape{
    final double pi=3.1416;
   double r;
    Circle(double r){
        this.r=r;
        
    }
    double getArea(){
        //System.out.println("Area of Circle");
        return pi*r*r;
    }
}
class Square extends Shape{
    int length;
    Square(int l){
        this.length=l;
        
    }
    double getArea(){
        //System.out.println("Area of Square");
        return length*length;
    }

}
public class Call {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        Shape s[]=new Shape[10];
        for(int i=0;i<3;i++){
            System.out.println("Enter 1 to find Area of Rectanglle.Similarly,2 to find Area of Circle and 3 to find Area of Circle ");
            int ch=sc.nextInt();
            switch(ch){               
                case 1:
                    System.out.println("Enter length and breadth");
                    s[i]=new Rectangle(sc.nextInt(),sc.nextInt());
                    s[i].getArea();
                    break;
                case 2:
                    System.out.println("Enter radius");
                    s[i]=new Circle(sc.nextDouble());
                    s[i].getArea();
                    break;
                case 3:
                    System.out.println("Enter length");
                    s[i]=new Square(sc.nextInt());
                    s[i].getArea();
                    break;
                default:
                    System.out.println("Please enter valid option");
            }
        }
        System.out.println("Printing the value");
        System.out.println("===================");
        for(int i=0;i<3;i++){
            
            System.out.println(""+s[i].getArea());
            System.out.println();
        }
        
    }
}

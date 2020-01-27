import java.util.Scanner;
class Point {
    double x;
    double y;
    double dist;
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    double distanceto(Point p){
        double distance=Math.sqrt(Math.pow((p.x-x), 2)+Math.pow((p.y-y),2));
        return distance;
    }
    Point getMidPoint(Point p1, Point p2){
        return new Point(((p1.x+p2.x)/2),((p1.y+p2.y)/2));
    }
    
}

class Distance{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Co-ordinates P1:");
        System.out.println("Enter x co-ordinate:");
        double a=sc.nextDouble();
        System.out.println("Enter y co-ordinate:");
        double b=sc.nextDouble();
        Point p1=new Point(a,b);
        System.out.println("Enter the Co-ordinates P2:");
        System.out.println("Enter x co-ordinate:");   
        double c=sc.nextDouble();
        System.out.println("Enter y co-ordinate:");
        double d=sc.nextDouble();
        Point p2=new Point(c,d);
        
        double e=p1.distanceto(p2);
        String formatteddouble=String.format("%.2f", e);
        System.out.println("Distance between P1 and P2:"+formatteddouble);
        
        Point p3=p1.getMidPoint(p1,p2);
        System.out.println("Midpoints of P1 and P2:"+"\nx co-ordinate"+p3.x+"\ny co-ordinate"+p3.y);
        
        
    }
    
}
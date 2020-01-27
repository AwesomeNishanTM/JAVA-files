/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author KIST
 */
class Rectangle{
    int l;
    int b;
    int h;
    Rectangle(int length,int breadth,int height){
     l=length;
     b=breadth;
     h=height;
    }
    void volume(){
    System.out.println("Volume of the rectangle="+l*b*h+"cm cube");

}
}
public class DemoConstructor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    Rectangle R=new Rectangle(4,4,4);
    R.volume();
    }
    
}

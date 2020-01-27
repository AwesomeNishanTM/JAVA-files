/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Taji zewi
 */
public class ClassDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Box mybox=new Box();
        double vol;
        mybox.width=10;
        mybox.height=10;
        mybox.depth=10;
        //now calculating the volume od the object
        vol=mybox.width*mybox.height*mybox.depth;
        System.out.println("Volume of an object "+vol+" cm cube");
        
    }
    
}
class Box{
    double width;
    double height;
    double depth;
}

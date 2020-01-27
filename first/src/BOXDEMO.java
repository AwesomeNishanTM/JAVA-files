/*
 * To change this l
icense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author KIST
 */
class box {
    int l;
    int b;
void getArea(){
   System.out.println(l*b);
}
}
public class BOXDEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        box b=new box();
        System.out.println("Enter length");
        b.l=sc.nextInt();
        System.out.println("Enter breadth");
        b.b=sc.nextInt();
        b.getArea();
  
        
        // TODO code application logic here
    }
    
}

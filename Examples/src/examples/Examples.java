/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Taji zewi
 */
import java.util.Scanner;
class  Add{
    int a;
    int b,c;
    //int a,b,c;
    /*public Addition(int A,int B,int C){
        this.a=A;
        this.b=B;
        this.c=C;
    }*/
    int sum(){
        return a+b;
     }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    
}
public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
        
        
       Add a=new Add();
       a.a=sc.nextInt();
       a.b=sc.nextInt();
       System.out.println("Sum of Two Integer= "+a.sum());
       System.out.println("sum of Three Integer= "+a.sum(1,2,3));
        
    }
    
}

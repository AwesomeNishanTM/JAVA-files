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
public class fibonancis {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum;
        System.out.print(a+" ");
        System.out.print(b +" ");
        for(int i=0;i<n-2;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }    
}

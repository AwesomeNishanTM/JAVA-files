/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeProgram;
import java.util.Scanner;
/**
 *
 * @author Taji zewi
 */
public class Prime {
    public static void main (String args[]){
        System.out.println("Enter a number to check whether it is prime or not");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0){
            count++;
            }
        }
        if(count==2){
        System.out.println("The entered number is prime");
        }
        else
            System.out.println("The entered number is not a prime");
        }
    }


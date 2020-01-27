/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIST
 */
import java.util.Scanner;
class Book{
    String B_Name;
    int B_Price;
     Book getCostlyBook(Book b[]){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
               if(b[i].B_Price>b[j].B_Price){
                   Book temp=b[i];
                   b[i]=b[j];
                   b[j]=temp;
               }
            } 
            
        }
     return b[0];     
    } 
    
}

public class Demo {
    public static void main(String args[]){
        Book b[]=new Book[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<b.length;i++){
            b[i]=new Book();
            System.out.println("Book No:-"+(i+1));
            System.out.println("enter book name ");
            b[i].B_Name=sc.next();
            System.out.println("Enter Book Price");
            b[i].B_Price=sc.nextInt();
        }
         System.out.println("Costly Book:-\n "+b[0].getCostlyBook(b)+"Book Name:- "+b[0].B_Name+"\nBook Price:-"+b[0].B_Price);
         
    }
}

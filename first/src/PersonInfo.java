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
        
class Person{
   String Name;
   int age;
   int Contact_no;

}        
public class PersonInfo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Person P1=new Person();
        Person P2=new Person();
        Person P3=new Person();
        System.out.println("Detail of First person:");
        System.out.println("Enter Name:");
        P1.Name=sc.next();
        System.out.println("Enter Age:");
        P1.age=sc.nextInt();
        System.out.println("Enter Contact No:");
        P1.Contact_no=sc.nextInt();
        System.out.println("\n");
          
        System.out.println("Detail of second person:");
        System.out.println("Enter Name:");
        P2.Name=sc.next();
        System.out.println("Enter Age:");
        P2.age=sc.nextInt();
        System.out.println("Enter Contact No:");
        P2.Contact_no=sc.nextInt();
        System.out.println("\n");
        
        System.out.println("Detail of Third person:");
        System.out.println("Enter Name:");
        P3.Name=sc.next();
        System.out.println("Enter Age:");
        P3.age=sc.nextInt();
        System.out.println("Enter Contact No:");
        P3.Contact_no=sc.nextInt();
        
        if(P1.age>P2.age && P1.age>P3.age){
            System.out.println("Name:"+P1.Name);
            System.out.println("Age:"+P1.age);
            System.out.println("Contact No:"+P1.Contact_no);
        }
        else if(P2.age>P1.age && P2.age>P3.age){
            System.out.println("Name:"+P2.Name);
            System.out.println("Age:"+P2.age);
            System.out.println("Contact No:"+P2.Contact_no);
        }
        else{
            System.out.println("Name:"+P3.Name);
            System.out.println("Age:"+P3.age);
            System.out.println("Contact No:"+P3.Contact_no);
        }
}
}

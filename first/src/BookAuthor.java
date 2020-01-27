/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Taji zewi
 */
import java.util.Scanner;
public class BookAuthor {
                int ID;
                String Name;
 String Publication;
                BookAuthor(int n, String s,String p){
                      System.out.println("Constructor called.");
                      ID = n;
                      Name = s;
                      Publication=p;
                }
 
                public static void main(String args[]){
                     //constructor call
                     BookAuthor obj1 = 
                          new BookAuthor(10, "CodesJava","XYZ");
 
                     //print values of object properties
                     System.out.println("Author ID = " + obj1.ID);
                     System.out.println("Author Name = " + obj1.Name);
                     System.out.println("Publication="+obj1.Publication);
                }
} 


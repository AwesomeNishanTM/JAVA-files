/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SACHIN
 */
import java.io.*;
public class String1 {
    public static void main(String[] args) {
        try{
            File dir =new File("S:\\Sachin");
            FileWriter f=new FileWriter(dir+"\\file2.txt",true);
           // f.write("hello world");
//            char[] charr={'f','r','o','m'};
//            f.write(charr);
System.out.println();
//            f.write(65);
//            f.close();
//            System.out.println("file created successsfully");
            FileReader f1=new FileReader(dir+"\\file2.txt");
            int c;
            while((c=f1.read())!=-1){
                System.out.print((char)c);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}

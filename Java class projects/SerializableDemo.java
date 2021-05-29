/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SACHIN
 */
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Person implements Serializable{
    int id;
    String name;
    int age;
    Person(int id,String name,int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public String toString(){
        return "Person info:\n Name:"+name+" Age:"+age+" id:"+id;
    }
    
}
public class SerializableDemo {
    
    public static void main(String[] args) {
        try{
            FileOutputStream f=new FileOutputStream("S:\\Sachin\\file4.txt");
            ObjectOutputStream oos=new ObjectOutputStream(f);
            Person p[]={new Person(1,"sachin",10),new Person(2,"nishandai",20)};
            oos.writeObject(new Person(1,"sachin",10));
            Person p1=new Person(1,"nisn",40);
            oos.writeObject(p);
            oos.close();
            
            FileInputStream f1=new FileInputStream("S:\\Sachin\\file4.txt");
            ObjectInputStream n=new ObjectInputStream(f1);
            Person p2=(Person) n.readObject();
            System.out.println(p2);
            Person[] p3=(Person[]) n.readObject();
            System.out.println(p3[1]);
            
            
        }catch(Exception ex){
            
        }
        
    }
}

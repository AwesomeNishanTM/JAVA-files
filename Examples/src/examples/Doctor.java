
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
class Doctor {
    private String name;
    private int age;
    private int salary;
    
    void setinfo(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        
    }
    
    void getinfo(Doctor doc[]){
        for(int i=0;i<doc.length;i++){
            if(doc[i].age<35 && doc[i].salary>=50000){
                System.out.print("\nName:-"+doc[i].name+"\nAge:-"+doc[i].age+"\nSalary:-"+doc[i].salary);
            }
        }
    }
     
    void display(Doctor doc[]){
        
           for(int i=0;i<doc.length;i++){
            System.out.println("\nName:-"+doc[i].name+"\nAge:-"+doc[i].age+"\nSalary:-"+doc[i].salary);
            
           }
    }
    
}

class doctorInfo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        Doctor d[]=new Doctor[n];
        for(int i=0;i<d.length;i++){
            d[i]=new Doctor();
            System.out.println("Enter Name");
            String name=sc.next();
            System.out.println("Enter age");
            int age=sc.nextInt();
            System.out.println("Enter salary");
            int salary=sc.nextInt();
            d[i].setinfo(name, age, salary);
        }
        System.out.print("\nThe list of Doctors are:-");
        d[0].display(d);
        System.out.print("\nThe list of doctors under 35 and earning 50000+ are:");
        d[0].getinfo(d);
    }
}

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
public class Currency {
    int Rs;
    int Paisa;    
}
 
class SumOfCurrency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Currency C1=new Currency();
        Currency C2=new Currency();
        Currency C3=new Currency();
       int n=0;
        System.out.println("Enter currency for first object");
        System.out.println("Enter Rs");
        C1.Rs=sc.nextInt();
        System.out.println("Enter Paisa");
        C1.Paisa=sc.nextInt();
        System.out.println();
        System.out.println("Enter currency for second object");
        System.out.println("Enter Rs");
        C2.Rs=sc.nextInt();
        System.out.println("Enter Paisa");
        C2.Paisa=sc.nextInt();
      
        System.out.println("Now adding the currency and putitng them in third object");
        /*C3.Rs=C1.Rs+C2.Rs;
        C3.Paisa=C1.Paisa+C2.Paisa;
        if(C3.Paisa==100){
            C3.Rs=C3.Rs+1;
            C3.Paisa=0;
             System.out.println("Rs="+C3.Rs);
        System.out.println("Paisa="+C3.Paisa);
           
        }
        else if(C3.Paisa>99&&C3.Paisa!=100){
            n=C3.Paisa/100;
            C3.Rs=C3.Rs+n;
            C3.Paisa=C3.Paisa%100;
             System.out.println("Rs="+C3.Rs);
        System.out.println("Paisa="+C3.Paisa);
        }
        else{*/
        
//        C3.Rs=C2.Rs+C1.Rs+((C2.Paisa+C1.Paisa)/100);
//        C3.Paisa=C2.Paisa+C1.Paisa;
        System.out.println("Rs="+((C1.Rs+C2.Rs)+(C1.Paisa+C2.Paisa)/100));
        C3.Paisa=C2.Paisa+C1.Paisa;
        if(C3.Paisa>100){
        C3.Paisa=C3.Paisa-100;
       System.out.println("Paisa="+C3.Paisa);
        }
        else if(C3.Paisa==100){
            System.out.println("Paisa="+0);
        }
    }
}

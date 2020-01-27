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
public class Marks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subject");
        int num=sc.nextInt();
        double marks[]=new double[5];
        double total=0;
        double average;
        double percentage;
        for(int i=0;i<num;i++){
            System.out.print("marks for Subject no:"+(i+1)+" ");
            marks[i]=sc.nextDouble();
            System.out.println();
        }
        //now calculating the average marks of a student.
        for(int i=0;i<num;i++){
            total=total+marks[i];
        }
        System.out.println("total marks of a student="+total);
        average=total/num;
        System.out.println("Average mark="+average);
        percentage=(total/(num*100))*100;
        System.out.println("Percentage of a student="+percentage);
    }
}

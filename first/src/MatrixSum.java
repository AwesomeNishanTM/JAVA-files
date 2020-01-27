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
public class MatrixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int sum[][]=new int[2][2];
        //now inputting 1st matrix elements
        System.out.println("Inputting 1st matrix elements");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        //for 2nd matrix 
        System.out.println("Inputting 2nd matrix elements");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=sc.nextInt();
            }System.out.println();
        }
        //sum of both the matrixes
        System.out.println("sum of above matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]);
            }System.out.println();
        }    
    }   
}

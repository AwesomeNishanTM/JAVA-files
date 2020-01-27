/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixTranspose;
import java.util.Scanner;
/**
 *
 * @author Taji zewi
 */
public class MatrixTranspose {
    public static void main(String args[]){
    System.out.println("Enter a matrix");
    Scanner sc=new Scanner(System.in);
    int original[][]=new int[3][2];
    int transpose[][]=new int[2][3];
    for(int i=0;i<3;i++){
    for(int j=0;j<2;j++){
        original[i][j]=sc.nextInt();
     
    }
    }
    
    System.out.println();
    //transposing
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            transpose[i][j]=original[j][i];
        }
    }
    
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
        System.out.print(original[i][j]+" ");
        }System.out.println();
    }
    System.out.println();
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }
    }
}

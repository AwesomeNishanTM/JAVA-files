/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author KIST
 */
class Adder{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        Adder ad=new Adder();
        System.out.println(ad.add(1,2));
        System.out.println(ad.add(2,3,4));
        
    }
}

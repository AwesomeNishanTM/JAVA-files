
import java.util.Scanner;
class Stack{
    int a[]=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int n){
        if(tos==9){
            System.out.println("stack is full");
        }
        else a[++tos]=n;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack overflow");
            return 0;
        }
        else {
            return a[tos--];
        }
    }
}
class call{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack stc=new Stack();
        for(int i=0;i<10;i++){
            // System.out.println("Enter a integer number:");
            stc.push(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(stc.pop());

        }
    }
}
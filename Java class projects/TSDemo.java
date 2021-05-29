class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }

    }
}

class MyThreada extends Thread{
    Table t;
    MyThreada(Table t){
       this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThreadb extends Thread{
    Table t;
    MyThreadb(Table t){
        this.t=t;

    }
    public void run(){
        t.printTable(100);
    }
} 
public class TSDemo{
    public static void main(String[] args){
        Table obj=new Table();
        MyThreada t1=new MyThreada(obj);
        MyThreadb t2=new MyThreadb(obj);
        t1.start();
        t2.start();
    }
}
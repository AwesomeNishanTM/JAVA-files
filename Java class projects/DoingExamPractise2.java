// swapping value
class swap{
    int a,b;
    swap(int i, int j){
        a=i;
        b=j;
    }
    void swa(swap ob){
        int temp=this.a;
        a=b;
        b=temp;
    }
}
class calldemo{
    public static void main(String args[]){
        swap s=new swap(2,3);
        System.out.println("before swapped"+s.a+" "+s.b);
        s.swa(s);
                System.out.println(s.a+" "+s.b);
    }   
}

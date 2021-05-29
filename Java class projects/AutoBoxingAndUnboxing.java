class Boxing{
    public static void main(String args[]){
        //UnBoxing Example 
        String s=new String("hello");
        String p=s;
        System.out.println(s);
        System.out.println(p);

        //AutoBoxing Example
        String s2="hello java";
        String s1=new String(s2);
        System.out.println(s1);;


    }
}
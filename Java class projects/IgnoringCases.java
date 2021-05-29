class IgnoringSomeArrayElement{
    public static void main(String args[]){
        String phonelist[]={"9841555555","97719849333333","+977-9818777777","+9771-9803000000"};
        for(int i=0;i<phonelist.length;i++){
            if(phonelist[i].length()!=10){
                System.out.println(phonelist[i].substring(phonelist[i].length()-10));
            }
            else{
                System.out.println(phonelist[i]);
            }
            // System.out.println(phonelist[i]);
        }
        // System.out.println(phonelist[2].equalsIgnoreCase("977"));    
    }
    
}
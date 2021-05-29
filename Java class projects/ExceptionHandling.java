class ExceptionHandling{
     public static void main(String args[]){
         int arr[]=new int[4];
         try{
            arr[5]=7;
            System.out.println(arr[5]);
         }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
         }
         try{
            String b=null;
            System.out.println(b.length());

         }catch(NullPointerException ex){
            System.out.println(ex);
         }
         

    }
}
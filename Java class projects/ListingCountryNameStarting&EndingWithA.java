import java.util.Scanner;
class CountryNameStartsAndEndsWithA{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String countryarr[]=new String[10];
        System.out.println("Enter 10 countres name:-");
        for(int i=0;i<10;i++){
            countryarr[i]=sc.next();
            System.out.println("--------------");
        }
        System.out.println("Displaying the countries name staring and ending with 'a'. ");
        for(int i=0;i<10;i++){
            if(countryarr[i].startsWith("A") && countryarr[i].endsWith("a")){
                System.out.println(countryarr[i]);

            }
        }
        
    }
}
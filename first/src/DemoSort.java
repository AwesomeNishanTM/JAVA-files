/**
 * Class BIM 3rd SEM,Section 'A'
 * Roll NO:13
 * KISt college
 * @author Nishan Thapa
 */
public class DemoSort {
    public static void main(String args[]){
        int arr[]={10,45,22,32,67,8,12};
        int temp;
        for(int i=0;i<arr.length;i++){
            System.out.println("array elements: "+arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    //swapping the array element
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array Elements");
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=",i+1);
           System.out.print(arr[i]+"  ");
        }
    }
}
    

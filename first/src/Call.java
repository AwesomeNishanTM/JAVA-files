import java.util.Scanner;
class PersonDetail {
    String name;
    int age;
    
}
        
class Call{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details:-");
        PersonDetail p[]=new PersonDetail[2];
        for(int i=0;i<2;i++){
            System.out.println("Person:-"+(i+1));
            System.out.print("Enter the Name:");
            p[i]=new PersonDetail();
            p[i].name=sc.next();
            System.out.print("Enter Age:");
            p[i].age=sc.nextInt();
            
            
            
        }
        for(int i=0;i<2;i++){
            for(int j=1;j<2;j++){
                if(p[i].age>p[j].age){
                    PersonDetail temp=p[i];
                      p[i]=p[j];
                    p[j]=temp;
                }
            }
        }
        System.out.println("The ascending order according to age:-");
        for(int i=0;i<2;i++){
            System.out.println("Person:-"+(i+1));
            System.out.println("Name="+p[i].name);
            System.out.println("Age="+p[i].age);
            
        }
                
    }
}



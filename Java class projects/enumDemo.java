public class enumDemo{
    public static void main(String[] args){
        for(gender g:gender.values())
        {
        System.out.println(g);
    } 
    }
}
enum gender{MALE,FEMALE,OTHER}
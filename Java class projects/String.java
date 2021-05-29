
import java.io.*;

class String1 {
    
    static void p(String s) {
        System.out.println(s);
    }
    
    public static void main(String args[]) {
        try{
            File f1=new File("C:\\AmunDaka");
            if(!f1.exists()){
                f1.mkdir();
            }
            File f2=new File(f1,"Nishan.txt");
            if(!f2.exists()){
                f2.createNewFile();
            }
            p("File Name:"+f1.getName());
            p("Path"+f1.getPath());
            p("Parent"+f1.getParent());
            p(f1.exists()?"exists":"does not ezist");
            p(f1.canWrite()?"writeable":"not writeable");
            p(f1.canRead()?"is readable":"not readable");
            p(f1.isDirectory()?"root":"a Directory");
            p("File last modified:"+f1.lastModified());
            p("File size:"+f1.length()+" Byte");
        }catch(Exception ex){
            System.out.println(ex);

        }
            
        

    }
}
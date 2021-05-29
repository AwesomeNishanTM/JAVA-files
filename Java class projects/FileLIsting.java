import java.io.*;
import java.nio.file.*;

class CopyFile{
    public static void main(String args[]){
        String directryname="F:\\dir1";
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in =new FileInputStream(directryname+"\\file2.txt");
            out =new FileOutputStream(directryname+"\\file4.txt");
            int c;
            byte b[]={65,66,67,68,69};
            out.write(b);
            while ((c=in.read())!=-1){
                 System.out.print(c);
            out.write(c);
             }
            in.close();
            out.close();

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
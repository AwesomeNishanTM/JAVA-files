import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.DirectoryStream;
import java.io.IOException;

class FileListingNaming2{
    static void p(final String string) {
        System.out.println(string);
    }

    public static void main(final String args[]) throws Exception{
        final Scanner sc=new Scanner(System.in);
        // Path dir=Paths.get("F:\\JavaFile Demo");
         /*(DirectoryStream<Path> stream=Files.newDirectoryStream(dir,"a"))*/
       try
        {
        final File f1=new File("F:\\JavaFile Demo");
        if(!f1.exists()){
            f1.mkdir();
        }
        p(f1.length()+"Bytee");
    //     for(int i=0;i<10;i++){
    //     p("Enter a file Name with extension:");        
    //     final File f2=new File(f1,sc.nextLine().trim());
    //     if(!f2.exists()){
    //         f2.createNewFile();
    //     }else{
    //         System.out.println("File name collide.");
    //     }
    // }
            for(File file:f1.listFiles()){
                if(file.getName().contains("2")){
                    System.out.println(file);
                    
                }

            }
            // for(Path p:stream){
            //     System.out.print(p.getFileName());
            // }

        }catch(Exception ex){
            System.out.println(ex);

        }
    }
}
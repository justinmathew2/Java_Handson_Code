package exp10;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Exp10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        Scanner s=new Scanner(System.in);
        String str="I am Justin $. This is my tenth excercise in & java.";
       
       // CharBuffer b[]=new CharBuffer[100];
        File file=new File("sample.txt");
        FileWriter f=new FileWriter(file);
       
       f.write(str);
        f.flush();
        f.close();
        
        FileReader r=new FileReader("sample.txt");
        int ch;
        int count=0;
        int cont1=0;
        
      while( (ch=r.read())!=-1)
      {
        if(ch==32){
            count=count+1;
           }
        else if(ch==46||ch==44||ch==33)
        {
        cont1=cont1+1;
        }
        
          
      }
      System.out.println("The string is: "+str);
      System.out.println("The number of white spaces are: "+count);
      System.out.println("The number of punctuation marks are: "+cont1);
      
        r.close();
    }

    }
    


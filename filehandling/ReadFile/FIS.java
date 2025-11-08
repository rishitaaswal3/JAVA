package filehandling.ReadFile;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS {
   public static void main() {
       try(FileInputStream fis = new FileInputStream("filehandling/ReadFile/demo.txt")){
           int data=fis.read();
           while(data != -1){
               System.out.print((char)data);
               data = fis.read();
           }
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
/*
FileInputStream is a class in the java.io package that is used to read data from a file in the form of bytes.

--->Full Definition
- FileInputStream is a byte stream class used for reading raw byte data such as images, audio, video, or text files from the file system.
- It reads data byte by byte (8 bits at a time) and can handle both binary and text data.
 -> FileInputStream inherits from InputStream class.
 */
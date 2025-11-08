package filehandling.Writefiles;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {
    public static void main() {
        try{
            FileOutputStream fos = new FileOutputStream("filehandling/ReadFile/demo.txt",true);
            fos.write("Hi my name is anant".getBytes());

            System.out.println("file changed successfully");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
--> FileOutputStream is a class in Java (in java.io package)
    used to write raw bytes (binary data) to a file.
--  It is part of Java’s byte stream system — meaning it writes
    byte-level data, not characters or text directly.
-- FileOutputStream extends OutputStream.
-- Constructor: Either use String or File object(file path).
-- write method allows only 2 parameters: int and byte array.
  * If we want to write String: use getBytes() method.
  * If we want to pass int(ASCII) : Simply pass ascii code.
-- By default it overwrites file if we execute code but if we want to not overwrite it just
   appending in last use boolean 'true' in FOS.
 */

package filehandling.Writefiles;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DOS {
    public static void main(String[] args) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("filehandling/ReadFile/test.txt"))){
            dos.writeUTF("Anant Butola");
            dos.writeInt(10);
            dos.writeBoolean(true);
            System.out.println("file created successfully with data saved");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
/*
--> The DataOutputStream class in Java is used to write primitive data types
    (like int, float, double, boolean, char, long, and String) to an output stream
    in a machine-independent (platform-neutral) binary format.
 -- ("public class DataOutputStream extends FilterOutputStream implements DataOutput")
 -- Constructor: (OutputStream out)

-->  Why Do We Need It?
--  Normally, FileOutputStream can only write bytes.
--  But if you want to store numbers, strings, or other
    primitives directly, you’d need to convert them to bytes manually — which is tedious.
--  DataOutputStream makes this automatic and consistent, so that the same data
    can be read back later using DataInputStream.

** | Method                    | Description                                                  |
| ------------------------- | ------------------------------------------------------------ |
| `writeInt(int v)`         | Writes a 4-byte integer                                      |
| `writeDouble(double v)`   | Writes an 8-byte double                                      |
| `writeBoolean(boolean v)` | Writes a 1-byte boolean                                      |
| `writeChar(int v)`        | Writes a 2-byte character                                    |
| `writeFloat(float v)`     | Writes a 4-byte float                                        |
| `writeLong(long v)`       | Writes an 8-byte long                                        |
| `writeUTF(String s)`      | Writes a string in UTF-8 format (can be read by `readUTF()`) |
| `flush()`                 | Forces any buffered data to be written to the output stream  |

**IMP POINT:
-Data written by DOS can be read by DIS only.....
- DOS creates structured data that can be read by DIS only.

 */
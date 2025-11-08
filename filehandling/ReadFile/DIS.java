package filehandling.ReadFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DIS {
    static void main() {
        try(DataInputStream dis = new DataInputStream(new FileInputStream("filehandling/ReadFile/test.txt"))){
            System.out.println("name: "+dis.readUTF());
            System.out.println("rollNo: "+dis.readInt());
            System.out.println("18+: "+dis.readBoolean());

        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
/*
--> DataInputStream is a class in java.io used to read primitive data types
 (like int, double, char, boolean, etc.) and strings from an input stream.
- It allows you to read data in the same format that was written by a DataOutputStream.
-  ("class DataInputStream extends FilterInputStream implements DataInput")
- Constructor : (InputStream in)

->Why Use DataInputStream?
--- If you use only FileInputStream, you can read raw bytes, but you’ll have to
    manually convert them into numbers or text.
--- DataInputStream makes this easier by directly reading Java’s primitive data types.

***IMPORTANT POINT:
-- Data written by DataOutputStream can be read by DataInputstream . No other file data
    read by DataInputStream b/c DOS makes some format ,so DIS able to read only that format.

*Methods:
| Method                  | Description                                                        |
| ----------------------- | ------------------------------------------------------------------ |
| `boolean readBoolean()` | Reads one boolean value.                                           |
| `byte readByte()`       | Reads one byte.                                                    |
| `char readChar()`       | Reads one character (2 bytes).                                     |
| `int readInt()`         | Reads a 4-byte integer.                                            |
| `double readDouble()`   | Reads an 8-byte double value.                                      |
| `float readFloat()`     | Reads a 4-byte float value.                                        |
| `long readLong()`       | Reads an 8-byte long value.                                        |
| `String readUTF()`      | Reads a string written using `writeUTF()` from `DataOutputStream`. |

**Format matching:
If we write something like this in particular sequence: String->int->boolean
We can read that in exact same sequence: String->int->boolean (correct)
                                         int-> boolean-> string (incorrect)
 */

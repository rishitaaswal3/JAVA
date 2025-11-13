package filehandling.ObjectSerialization;

import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class OSconcept {
    public static void main(String[] args) {
        Student s1 = new Student(10,"Anant");
        Student s3 = new Student(12,"Butola");
        try(FileOutputStream fos = new FileOutputStream("filehandling/ObjectSerialization/Student.ser")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s3);
            System.out.println("Object  Serialized Successfully ");
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }

       try(FileInputStream fis = new FileInputStream("filehandling/ObjectSerialization/Student.ser")){
        ObjectInputStream ois = new ObjectInputStream(fis);
           System.out.println("Object  Deserialized Successfully ");
       while (true){
           try{
               Student s2 = (Student) ois.readObject();

               System.out.println("Roll No : "+s2.rollNo);
               System.out.println("Name : "+s2.name);
           }catch(EOFException ie){
              break;
           }
       }
       } catch (IOException | ClassNotFoundException e) {
           System.out.println("File not found" + e.getMessage());
       }

    }
}









//with example 



package filehandling.ObjectSerialization;

import java.io.*;  // Importing all input/output related classes

// Class Student implements Serializable interface
// Serializable means objects of this class can be converted into a stream of bytes
class Student implements Serializable {
    int rollNo;
    String name;

    // Constructor to initialize Student object
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class OSconcept {
    public static void main(String[] args) {
        
        // Creating two Student objects
        Student s1 = new Student(10, "Anant");
        Student s3 = new Student(12, "Butola");

        // ==============================
        // SERIALIZATION PROCESS
        // ==============================
        // Serialization = Converting object → byte stream (to store in file)
        try (FileOutputStream fos = new FileOutputStream("filehandling/ObjectSerialization/Student.ser")) {
            // ObjectOutputStream is used to write objects into the file
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Writing (serializing) objects into the file
            oos.writeObject(s1);
            oos.writeObject(s3);

            System.out.println("Object Serialized Successfully");

        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // ==============================
        // DESERIALIZATION PROCESS
        // ==============================
        // Deserialization = Converting byte stream → object (to read data back)
        try (FileInputStream fis = new FileInputStream("filehandling/ObjectSerialization/Student.ser")) {
            // ObjectInputStream is used to read objects from file
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("Object Deserialized Successfully");

            // Keep reading objects until end of file
            while (true) {
                try {
                    // Reading object from file and typecasting it to Student
                    Student s2 = (Student) ois.readObject();

                    // Displaying the object's data
                    System.out.println("Roll No : " + s2.rollNo);
                    System.out.println("Name : " + s2.name);
                } catch (EOFException ie) {
                    // EOFException = End of File reached → stop reading
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


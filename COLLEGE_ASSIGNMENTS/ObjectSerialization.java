package COLLEGE_ASSIGNMENTS;

import java.io.*;

/*
15. Write a Java program to serialize and deserialize an object using ObjectOutputStream and
ObjectInputStream.
 */
class Students implements Serializable {
    int rollno;
    String name;
    Students(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
}
public class ObjectSerialization {
    public static void main(String[] args) {
        Students obj = new Students(10,"Anant");
        try{
            FileOutputStream fos=new FileOutputStream("F:\\JAVA\\COLLEGE_ASSIGNMENTS\\anant.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println("Object Serialized Successfully ");
        }catch(IOException ie){
            System.out.println(ie.getMessage());
        }

        try{
            FileInputStream fis=new FileInputStream("F:\\JAVA\\COLLEGE_ASSIGNMENTS\\anant.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Students obj2 =(Students) ois.readObject();
            System.out.println("Object Deserialized Successfully ");
            System.out.println("Roll No : "+obj2.rollno);
            System.out.println("Name : "+obj2.name);
        }catch(IOException ie){
            System.out.println(ie.getMessage());
        }catch(ClassNotFoundException c){
            System.out.println(c.getMessage());
        }
    }
}

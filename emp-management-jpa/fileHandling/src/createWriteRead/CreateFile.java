package createWriteRead;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void main(String[] args) throws IOException {
//        File f=new File("Data/student.txt");
//        if(f.createNewFile()){
//            System.out.println("File created");
//        }else{
//            System.out.println("File already exists");
//        }

        File f=new File("Data/student.txt");
        if(f.exists()){
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("can write: "+f.canWrite());
            System.out.println("can read: "+f.canRead());
            System.out.println("length: "+f.length());
            System.out.println("name: "+f.getName());
        }else{
            System.out.println("File does not exist");
        }
    }
}

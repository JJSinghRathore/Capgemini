package createWriteRead;

import java.io.File;

public class CreateDirectory {
    static void main(String[] args) {
        File f= new File("Data");
        f.mkdir();
    }
}

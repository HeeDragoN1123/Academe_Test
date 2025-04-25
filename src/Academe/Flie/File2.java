package Academe.Flie;

import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String args[]){
        FileWriter out = null;

        try {
            out = new FileWriter("b.txt");
            out.write("A");
            out.write("가");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

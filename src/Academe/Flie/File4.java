package Academe.Flie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File4 {
    public static void main(String[] args)throws IOException{
        //텍스트 파일 읽기
        String filename = "b.txt";
        FileReader in = null;
        int i;

        try {
            in = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.print("파일이 없습니다");
            return;

        }
        try {
            while( (i= in.read()) != -1){
                System.out.print((char) i);
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        System.out.print((char) i);


    }
}

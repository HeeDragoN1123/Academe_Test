package Academe.Flie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File3 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String filename;
        String line;
        FileWriter out;
        System.out.print("파일명 : ");
        filename = scanner.nextLine(); // ✅ 파일명 먼저 입력받기
        File file = new File(filename + ".txt");
        if(file.isFile()){
            System.out.print("이미 존재하는 파일명입니다 덮어쓰시겠습니까? (y/n)");
            String yn = scanner.nextLine(); //y
            if(!yn.equalsIgnoreCase("y"));
            return;
        }


        try {
            out = new FileWriter(filename + ".txt");
            while (true){
               line = scanner.nextLine();
                if(line == "")break;
               out.write(line);

            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       /*
       파일명 abc
        내용을 입력하세요 (종료 : 새로운행에서 엔터)
       * */



    }
}

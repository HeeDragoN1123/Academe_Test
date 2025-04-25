package Academe.Flie;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String args[]){
        File a =new File("/Users/hee/Java/Academe_Test/src/Academe");
        File b= new File("/Users/hee/Java/Academe_Test/src/Academe/Array");
        File c= new File("/Users/hee/Java/Academe_Test/src/Academe/Array/정렬_버블정렬(코드제외).pdf");
        File d= new File("/Users/hee/Java/Academe_Test/src/Academe/Array/d");

        System.out.println(a.exists()); //존재하는지
        System.out.println(a.isFile()); //파일인지
        System.out.println(a.isDirectory()); //디렉토리인지
        System.out.println(a.length()); //파일 개수
        System.out.println(a.canRead()); //읽을수있는지
        System.out.println(a.getName()); //이름
        System.out.println(a.getPath()); // 경로
        System.out.println(a.getParent()); //부모 경로
        System.out.println(a.getAbsolutePath()); //절대 경로

        try {
            c.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }d.mkdir();
    }
}

package Academe.Extends;
//error, Exception
public class ExTest1 {
    public static void main(String args[]){
        int[] array = new int[5];
        int a = 10, b= 0, c;

        try {
            System.out.println(array[4]);
            c = a / b;
            System.out.println(c);
        }catch (ArithmeticException ex){
            System.out.println("0으로 나눌수 없습니다.");
            return;
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("배열의 범위를 벗어났습니다.");
        }catch (Exception ex){
            System.out.println("그밖의 예외");
        } finally {
            System.out.println("무조건 실행");
            //캐치 문에서 return같은것으로 매서드를 끝내도 파이널리는 실행 // 밑의 프로그램 뒷부분은 실행안된
        }
        System.out.println("프로그램 뒷부분");

    }
}

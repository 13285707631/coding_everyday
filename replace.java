import java.util.Scanner;

public class replace {
    static   String replaceSpace(StringBuffer str){
        return str.toString().replace(" ","%20");
    }
    public static void main(String [] arg){
        Scanner in =new Scanner(System.in);
        String a= in.nextLine();
        System.out.println(a.toString().replace(" ","%10"));

        StringBuffer b=new StringBuffer(a);
        System.out.print(replaceSpace(b));
    }
}

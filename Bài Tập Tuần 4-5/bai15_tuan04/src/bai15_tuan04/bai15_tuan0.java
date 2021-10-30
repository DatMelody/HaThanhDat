package bai15_tuan04;
import java.util.Scanner;
public class bai15_tuan0 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String S1= "abc";
        String S2= "xyzt";
        System.out.println("Chèn xâu 1 vào giữa xâu 2:");
        int tb = S2.length()/2;
        String a1 = S2.substring(0,tb+1);
        String a2=  S2.substring(S2.length()-tb);
        System.out.println(a1+S1+a2);
    }

}

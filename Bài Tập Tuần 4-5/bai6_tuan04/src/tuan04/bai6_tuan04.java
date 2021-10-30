package tuan04;
import java.util.Scanner;
public class bai6_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xau ki tu:");
        String n = scanner.nextLine();
        String[]a=n.split("");
        System.out.println("Xau ban dau");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println("Xau luc sau:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}

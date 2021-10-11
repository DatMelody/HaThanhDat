package Tuan03;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
		System.out.println("Ho tên: Ha Thanh Dat ");
        System.out.println("MSSV: 20181057");
        System.out.println("Ma Lop: 709155");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        int n = scanner.nextInt();
        float result =0;
        int t =0;
        int a=1;
        for(int i=1 ; i <=n ; i++){
            a*=i;
            t+=a;
            result+=(float)1/t;
        }
        System.out.println(result);
    }

}

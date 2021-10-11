package Tuan03;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
	System.out.println("Ho tên: Ha Thanh Dat ");
    System.out.println("MSSV: 20181057");
    System.out.println("Ma Lop: 709155");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so:");
    int n = scanner.nextInt();
    int result = Fibonaxi(n);
    System.out.println(result);
}
public static int Fibonaxi(int k){
    if(k==1){
        return 1;
    }
    else if(k==0){
        return 0;
    }
    else{
        return Fibonaxi(k-1)+Fibonaxi(k-2);
    }
}

}

package Tuan03;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		System.out.println("Họ tên: Hà Thành Đạt ");
        System.out.println("MSSV: 20181057");
        System.out.println("Mã Lớp: 709155");
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = scanner.nextInt();
        float result =0;
        float t =0;
        for(int i=1 ; i <=n ; i++){
            t=t+i;
            result+=(float)(1/t);
        }
        System.out.println(result);
	}

}

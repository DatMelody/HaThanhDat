package tuan03;
import java.util.Scanner;
import java.util.*;
public class bai2_tuan03 {
	public static void main(String[] args) {
        System.out.println("Ho va ten: Ha Thanh Dat");
        System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai day so:");
        int n = scanner.nextInt();
        System.out.println("Nhap day so: ");
        int b[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int nhap = scanner.nextInt();
            b[i] = nhap;
        }
        List<Integer>c = new ArrayList<>();
        for(int i = 0 ; i < b.length ; i++){
            if(isCheck(b[i])){
                c.add(b[i]);
            };
        }
        System.out.println("So nguyen to cua day nay la: ");
        c.stream().forEach(s-> System.out.print(s));
    }

    public static boolean isCheck(int input){
        boolean KT = true;
        if(input==1){
            KT=false;
            return KT;
        }
        for(int i=2; i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }
        return KT;
    }

}

package tuan04;
import java.util.Scanner;
public class bai7_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap day ki tu: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        System.out.println("So ban dau: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(isCheckKyTu(arr[i])){
                arr[i]="$";
            }
        }
        System.out.println("");
        System.out.println("So luc sau: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static boolean isCheckKyTu(String input){
        String mang[]={"1","2","3","4","5","6","7","8","9","0"};
        for(int i =0;i<mang.length;i++){
            if(input.equals(mang[i])){
                return true;
            }
        }
        return false;
    }

}

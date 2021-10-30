package tuan04;
import java.util.Scanner;
public class bai3_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten day du: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for(int i = arr.length-1; i>0;i--){
            if(arr[i].equals(" ")){
                for(int j=i+1;j<arr.length;j++){
                    System.out.print(arr[j]);
                }
                break;
            }
        }
    }

}

package tuan04;
import java.util.Scanner;
public class bai4_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten day du: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for(int i= 0; i< arr.length;i++){
            if(arr[i].equals(" ")){
                for(int j=0;j<i;j++){
                    System.out.print(arr[j]);
                }
                break;
            }
        }
    }

}

package tuan04;
import java.util.Scanner;
public class bai2_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String[]abc={"a","b","c"};
        System.out.println("Nhap sau: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        if (arr.length < 3) {
            System.out.println("So lan xuat hien 0");
        } else {
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("a") && arr.length-i>=3) {
                    for (int j=0;j<3;j++){
                        if(!arr[i+1].equals(abc[j+1])){
                            break;
                        }
                        else{
                            ++count;
                        }
                    }

                }
            }
            System.out.println("So day con la: "+count);
        }
    }
}

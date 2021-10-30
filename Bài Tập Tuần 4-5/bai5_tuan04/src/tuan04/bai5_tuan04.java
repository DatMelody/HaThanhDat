package tuan04;
import java.util.Scanner;
public class bai5_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sau ki tu:");
        String n = scanner.nextLine();
        String[]a=n.split("");
        System.out.println("So ban dau ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println("\n");
        for(int i=0;i<a.length;i++){
            if(a[i].equals("0")){
                a[i]="1";
            }
            else if(a[i].equals("1")){
                a[i]="0";
            }
        }
        System.out.println("So luc sau:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }

}

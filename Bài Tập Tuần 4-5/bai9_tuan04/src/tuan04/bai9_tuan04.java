package tuan04;
import java.util.Scanner;
public class bai9_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sau ki tu S: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.println("Chi so duoc danh tu 0 -> n-1");
        System.out.println("Chi so i: ");
        int i= Integer.parseInt(scanner.nextLine());
        System.out.println("Chi so j: ");
        int j = Integer.parseInt(scanner.nextLine());

        if(isCheckContains(i,j,xauA)){
            System.out.println("Mot trong hai chi so khong nam trong day!\n Vui long kiem tra lai!");
        }
        else{
            System.out.println("Xau ban dau: ");
            for(int h=0;h< xauA.length;h++){
                System.out.print(xauA[h]);
            }
            System.out.println("");
            System.out.println("Xau luc sau doi cho: ");
            String tmp = xauA[i];
            xauA[i] = xauA[j];
            xauA[j] =tmp;
            for(int h=0;h< xauA.length;h++){
                System.out.print(xauA[h]);
            }
        }

    }

    public static boolean isCheckContains(int i,int j,String[] xau){
        if(i>= xau.length || j>= xau.length){
            return true;
        }
        else{
            return false;
        }

    }

}

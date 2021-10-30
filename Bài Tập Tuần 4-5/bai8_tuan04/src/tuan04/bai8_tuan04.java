package tuan04;
import java.util.Scanner;
public class bai8_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xau ki tu S1: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.println("Nhap xau ki tu S2: ");
        String n1 = scanner.nextLine();
        String[] xauB = n1.split("");
        boolean KT = true;
        int count=0;
        if(xauA.length > xauB.length){
            System.out.println("Xau A khong xuat hien trong xau B!");
        }
        else {
            for (int i = 0; i < xauB.length; i++) {
                if(xauB[i].equals(xauA[0]) && xauB.length >= xauA.length){
                    for(int j=0;j< xauA.length;j++){
                        if(!xauA[j].equals(xauB[i])){
                            KT=false;
                            break;
                        }
                        else{
                            i++;
                        }
                    }
                    if(KT){
                        ++count;
                    }
                }

            }
        }
            System.out.println("So lan xuat hien xau A trong xau B la: "+count);

    }

}

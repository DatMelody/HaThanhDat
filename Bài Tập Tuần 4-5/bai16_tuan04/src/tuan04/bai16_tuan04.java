package tuan04;
import java.util.Scanner;
public class bai16_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String xau1= "Hà";
        String xau2= "HàThànhĐạt";
        boolean KT = true;
        for(int i=0;i<xau1.length();i++){
            if(!xau2.contains(xau1.split("")[i])){
                KT = false;
            }
        }
        if(KT){
            System.out.println("Xâu 1 là con của xâu 2!");
        }
        else{
            System.out.println("Xâu 1 không là con của xâu 1");
        }
    }
}

package tuan03;
import java.util.*;
public class bai5_tuan03 {
	public static void main(String[] args) {
        System.out.println("Ho va ten: Ha Thanh Dat");
        System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua day so:");
        int n = scanner.nextInt();
        System.out.println("Nhap so:");
        int b[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            int nhap = scanner.nextInt();
            b[i] = nhap;
        }
        List<Integer>c = new ArrayList<>();
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < b.length ; i++){
            if(isCheck(b,b[i])){
                c.add(b[i]);
            };
            if(isCheckHopso(b,b[i])==false){
                d.add(b[i]);
            }
        }
        System.out.println("So so nguyen to la: "+ c.size());

        System.out.println("So hop so la: "+d.size());
    }

    public static boolean isCheck(int b[],int input){
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
    public static boolean isCheckHopso(int b[],int input){
        boolean KT = true;
        if (input == 1) {
            KT=true;
            return KT;
        }
        for(int i=2;i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }

        return KT;
    }


}

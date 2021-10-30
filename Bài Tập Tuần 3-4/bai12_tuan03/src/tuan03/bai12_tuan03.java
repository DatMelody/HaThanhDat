package tuan03;
import java.util.*;
public class bai12_tuan03 {
	public static void main(String[] args) {
        System.out.println("Ho va ten: Ha Thanh Dat");
        System.out.println("MSSV: 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai day so A:");
        int n = scanner.nextInt();
        int[] dayA = new int[n];
        System.out.println("Nhap day so A:");
        for(int i = 0 ; i <  n; i ++){
            int nhap = scanner.nextInt();
            dayA[i] = nhap;
        }
        System.out.println("Nhap do dai day so B:");
        int m = scanner.nextInt();
        System.out.println("Nhap dai so B:");
        int[] dayB= new int[m];

        for(int i = 0 ; i < m ; i ++){
            int nhap = scanner.nextInt();
            dayB[i] = nhap;
        }

        if(isContains(dayA,dayB)){
            System.out.println("B contains A");
        }
        else{
            System.out.println("B no contains A");
        }
    }
    public static boolean isContains(int[]a , int[]b){
        boolean result = false;
        int sizeA = a.length;
        int sizeB= b.length;
        if(sizeA>sizeB){
            return result;
        }
        for(int i=0;i<sizeB;i++){
            if(b[i]==a[0] && (sizeB-i)>=sizeA){
                int k=i;
                for(int j=0;j<sizeA;j++){
                    if(a[j]==b[k]){
                        result = true;
                        ++k;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}

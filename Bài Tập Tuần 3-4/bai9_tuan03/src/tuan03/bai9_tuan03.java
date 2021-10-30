package tuan03;
import java.util.*;
public class bai9_tuan03 {
	public static void main(String[] args) {
        System.out.println("Ho va ten: Ha Thanh Dat");
        System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai day so:");
        int n = scanner.nextInt();
        System.out.println("Nhap so: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b[i] =nhap;
        }
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            c.add(b[i]);
        }
        System.out.println("Nhap so C");
        int soC = scanner.nextInt();
        System.out.println("Cac so bang so C:");
        for(int i=0;i<c.size();i++){
            if(soC==c.get(i)){
                System.out.println(c.get(i));
            }
        }
        System.out.println("Cac so nho hon so C:");
        for(int i=0;i<c.size();i++){
            if(soC>c.get(i)){
                System.out.println(c.get(i));
            }
        }
        System.out.println("Cac so lon hon so C:");
        for(int i=0;i<c.size();i++){
            if(soC<c.get(i)){
                System.out.println(c.get(i));
            }
        }

    }

}

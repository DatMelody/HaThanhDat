package tuan03;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class bai1_tuan03 {
	public static void main(String[] args) {
        System.out.println("Ho va ten: Ha Thanh Dat");
        System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang:");
        int n = scanner.nextInt();
        System.out.println("Nhap day so:");
        List<Integer> c = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int nhap = scanner.nextInt();
            c.add(nhap);
        }
        c.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).forEach(s-> System.out.print(s+" "));
    }


}

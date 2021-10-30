package tuan03;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
public class bai4_tuan03 {
	public static void main(String[] args) {
        System.out.println("Ho va ten: Ha Thanh Dat");
        System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua day:");
        int n = scanner.nextInt();
        List<Integer> b = new ArrayList();
        System.out.println("Nhap day so: ");
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b.add(nhap);
        }
        b = b.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).collect(Collectors.toList());
        System.out.println(b.get(0));
    }


}

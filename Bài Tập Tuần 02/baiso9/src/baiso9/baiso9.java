package baiso9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class baiso9 {
   private static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
   System.out.println("Ho Va Ten: Ha Thanh Dat");
   System.out.println("MSSV: 20181057");
   System.out.println("Ma Lop: 709155");
   System.out.print("Nhập số nguyên dương n = ");
   int n = scanner.nextInt();

   List<Integer> listNumbers = phanTichSoNguyen(n);

   System.out.printf("Kết quả: %d = ", n);
   int size = listNumbers.size();
   for (int i = 0; i < size - 1; i++) {
       System.out.print(listNumbers.get(i) + " x ");
   }
   System.out.print(listNumbers.get(size - 1));
}
 
public static List<Integer> phanTichSoNguyen(int n) {
   int i = 2;
   List<Integer> listNumbers = new ArrayList<Integer>();

   while (n > 1) {
       if (n % i == 0) {
           n = n / i;
           listNumbers.add(i);
       } else {
           i++;
       }
   }
   
   if (listNumbers.isEmpty()) {
       listNumbers.add(n);
   }
   return listNumbers;
   }      
}




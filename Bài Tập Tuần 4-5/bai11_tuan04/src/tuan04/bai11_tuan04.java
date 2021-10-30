package tuan04;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class bai11_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyen Van An";
        String s2 = "Ha Tuan An";
        String s3 = "Ha Thanh Dat";
        String s4 = "Nguyen Tien Dung";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("An")){
                ++count;
            }
        }
        System.out.println("So ban có ten An: "+count);

    }
}

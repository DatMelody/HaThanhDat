package tuan04;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class bai12_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyễn Thị A";
        String s2 = "Nguyễn Thị B";
        String s3 = "Nguyễn Thị C";
        String s4 = "Ha Thanh Dat";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3,s4);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("Thị")){
                ++count;
            }
        }
        System.out.println("So ban co ten dem Thị: "+count);

    }

}

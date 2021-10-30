package tuan04;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class bai10_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String s1="Ha Thanh Dat";
        System.out.println("Xau ky tu 1: "+s1);
        String s2 = "Ha Thanh Dat - SVDHBK";
        System.out.println("Xau ky tu 2: "+s2);
        List<String> arr = Arrays.asList(s1,s2);
        Map<Integer,String>stringMap = new HashMap<>();
        int max = s1.length();
        for(int i=1;i < arr.size();i++){
            if(max < arr.get(i).length()){
                max = arr.get(i).length();
                stringMap.put(1,arr.get(i));
            }
        }
        System.out.println("Xau co do dai dai nhat la: "+stringMap.get(1));
    }

}

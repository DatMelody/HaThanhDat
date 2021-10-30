package tuan04;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class bai13_tuan04 {
    public static void main(String[] args) {
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyễn Văn Hoàn";
        String s2 = "Nguyễn Văn Tiến";
        String s3 = "Nguyễn Thị Chi";
        String s4 = "Hà Thành Đạt";
        int count=0;
        List<String> arrA = Arrays.asList(s1,s2,s3,s4);
        for(int h=0;h<arrA.size();h++) {
            String[]arr = arrA.get(h).split("");
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i].equals(" ")) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if(arr[j].equals("H")){
                            ++count;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("Số bạn có tên bắt đầu bằng chữ H là : "+count);
    }

}

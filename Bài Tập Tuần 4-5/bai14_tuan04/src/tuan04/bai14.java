package tuan04;
import java.lang.*;
import java.util.Scanner;
public class bai14 {
	public static void main(String[] args) { 
	    System.out.println("Ho va ten: Ha Thanh Dat");
	    System.out.println("MSSV : 20181057");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		int count= s1.length();
		
		char[] s2 = s1.toCharArray();
		char s3 = s2[0];
		for (int i = 1; i < count; i++) {
			for (int j = 0; j < count-1; j++) {
				s2[j] = s2[j+1];
			}
        s2[count-1] = s3;  
        s3 = s2[0];
		}
		for (int i = 0; i < count; i++) {
			 System.out.print(s2[i]);
			 
		}
	}
}

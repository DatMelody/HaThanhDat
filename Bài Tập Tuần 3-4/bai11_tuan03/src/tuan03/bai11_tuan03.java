package tuan03;
import java.util.*;
public class bai11_tuan03 {
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
        for (int i = 0; i < b.length; i++) {
            c.add(b[i]);
        }
        List<Integer>d = new ArrayList<>();
        int max = 1;
        for(int i=0;i<c.size();i++){
            int count=1;
            for(int j=i;j<c.size()-1;j++){
                if(c.get(j)<=c.get(j+1)){
                    ++count;
                }
                else{
                    break;
                }
            }
            if(max<count){
                max=count;
                d.add(max);
                d.add(i);
            }
        }
        for(int i=0;i<d.size();i+=2){
            if(d.get(i)==max){
                System.out.println("Do dai day con dai nhat lien tuc don dieu tang la: "+max +" tai vi tri: "+d.get(i+1));
                System.out.println("Chi so day con do la");
                int vitri=d.get(i+1);
                for(int j=0;j<max;j++){
                    System.out.print(c.get(vitri)+" ");
                    vitri++;
                }
            }
        }
    }

}

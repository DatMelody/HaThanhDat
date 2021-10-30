package tuan03;
import java.util.*;
import java.util.stream.Collectors;
public class bai10_tuan03 {
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
        c=c.stream().sorted().collect(Collectors.toList());
        int max = 1;
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < c.size()-1;i++){
            int count =1;
            for(int j=i+1;j<c.size();j++){
                if(c.get(j)!=c.get(i)){
                    break;
                }
                else{
                    ++count;
                }
            }
            if(max<count){
                max=count;
                d.add(c.get(i));
                d.add(max);
            }

        }
        for(int i=1;i<d.size();i+=2){
            if(max==d.get(i)){
                System.out.println("Day con co so luong day so bang nhau dai nhat la: "+max + " chi so cua day con la: "+d.get(i-1));
                break;
            }
        };
    }

}

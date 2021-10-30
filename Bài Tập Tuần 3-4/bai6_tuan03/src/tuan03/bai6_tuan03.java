package tuan03;
import java.util.*;
import java.util.stream.Collectors;
public class bai6_tuan03 {
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

        for(int i = 0 ; i < b.length;i++){
            if(b[i]==1){
                c.add(b[i]);
                continue;
            }
            for(int j=0;j<b.length;j++){
                if(b[i]==b[j]){
                    continue;
                }
                if(b[j]%b[i]==0&&b[i]!=b[j]){
                    c.add(b[i]);
                }
            }
        }
        c=c.stream().sorted().collect(Collectors.toList());
        for(int i = 0 ; i <c.size()-1;i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(i)==c.get(j)){
                    c.set(j,0);
                }
            }
        }
        c.stream().filter(i->i!=0).forEach(s-> System.out.print(s+" "));
    }


}

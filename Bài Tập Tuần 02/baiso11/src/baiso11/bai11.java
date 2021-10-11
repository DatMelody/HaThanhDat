package baiso11;
import java.util.*;
public class bai11 {

	public static void main(String[] args) {
		System.out.println("Ho Va Ten: Ha Thanh Dat");
        System.out.println("MSSV: 20181057");
        System.out.println("Ma Lop: 709155");
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap day so:");
        int n = scanner.nextInt();
        String m = String.valueOf(n);
        String []b = m.split("");
        String luutru[] = new String[b.length];
        Random random = new Random();
        String[]after = manglucsau(b);
        for(int i = 0 ; i  < b.length ; i++){
            int vitri = random.nextInt(after.length);
            luutru[i]=after[vitri];
            after[vitri]="0";
            after = manglucsau(after);
        }
        System.out.println("Danh sach luc sau: ");
        for(int i=0;i< luutru.length;i++){
            System.out.print(luutru[i]);
        }
    }
    public static String[] manglucsau(String[]b){
        List<String>a = new ArrayList<>();
        for(int i= 0 ; i <b.length;i++){
            if(b[i]!="0"){
                a.add(b[i]);
            }
        }
        String after[] = new String[a.size()];
        for(int i = 0 ; i < a.size();i++){
            after[i] = a.get(i);
        }
        return after;
    }
}


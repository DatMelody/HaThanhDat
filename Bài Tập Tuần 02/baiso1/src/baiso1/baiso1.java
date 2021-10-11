package baiso1;

public class baiso1 {

	public static void main(String[] args) {
        System.out.println("Ho Va Ten: Ha Thanh Dat");
        System.out.println("MSSV: 20181057");
        System.out.println("Ma Lop: 709155");
		int k,n,dem;
        for(k=1; k<=100; k++){
            dem=0;
            for(n=2; n<=k; n++){
                if(k%n==0) dem++;
            }
            if(dem > 1) System.out.print(k + " ");
        }
    }
}

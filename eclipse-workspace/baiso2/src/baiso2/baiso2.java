package baiso2;

public class baiso2 {

	public static void main(String[] args) {
		System.out.println("Ho Va Ten: Ha Thanh Dat");
        System.out.println("MSSV: 20181057");
        System.out.println("Ma Lop: 709155");
		int k=0,n,dem,j=0;
        while(j<20){
            k++;
            dem=0;
            for(n=2;n<=(k/2);n++)
                if(k%n==0) dem++;
            if(dem==0){
                System.out.print(k + " ");
                j++;
            }
        }
    }

}

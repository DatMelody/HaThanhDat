package baiso6;

public class baiso6 {

	public static void main(String[] args) {
		System.out.println("Ho Va Ten: Ha Thanh Dat");
        System.out.println("MSSV: 20181057");
        System.out.println("Ma Lop: 709155");
		int k=0,j=0,n,tong;
        while(j<5){
            k++;
            tong=1;
            for(n=2;n<k;n++){
                if(k%n==0) tong+=n;
            }
            if(k==tong){
                System.out.print(k + " ");
                j++;
            }
        }
    }

}

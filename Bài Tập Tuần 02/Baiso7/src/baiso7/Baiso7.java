package baiso7;

public class Baiso7 {

	public static void main(String[] args) {
        System.out.println("Ho Va Ten: Ha Thanh Dat");
        System.out.println("MSSV: 20181057");
        System.out.println("Ma Lop: 709155");
		int d1=0,d2=0,d3=0,d4=0;
        for(int i=0;i<=100;i++)
            switch(i%5){
            case 0: d1++; break;
            case 1: d2++; break;
            case 2: d3++; break;
            case 3: d4++; break;
            }
        System.out.println("Co tat ca " + d1 + " so chia het cho 5");
        System.out.println("Co tat ca " + d2 + " so chia 5 du 1");
        System.out.println("Co tat ca " + d3 + " so chia 5 du 2");
        System.out.println("Co tat ca " + d4 + " so chia 5 du 3");
	}

}

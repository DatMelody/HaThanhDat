package baitapso3;

public class baitapso3 {

	public static void main(String[] args) {
		{
	        int i = 1000;
	        int num = 0;
	        String  primeNumbers = "";
	        for (i = 1000; i <= 2000; i++)
	        {
	            int counter=0;
	            for(num =i; num>=1; num--)
	            {
	                if(i%num==0)
	                {
	                    counter = counter + 1;
	                }
	            }
	            if (counter ==2)
	            {
	                primeNumbers = primeNumbers + i + " ";
	            }
	        }
	        System.out.println("Ho Va Ten: Ha Thanh Dat");
	        System.out.println("MSSV: 20181057");
	        System.out.println("Ma Lop: 709155");
	        System.out.println("Cac so nguyen to tu 1000 đen 2000 la:");
	        System.out.println(primeNumbers);
	    }

	}

}

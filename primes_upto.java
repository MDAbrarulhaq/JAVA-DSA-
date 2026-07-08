
/**

 * 
 */

import java.util.*;

/**
 * 
 */
public class primes_upto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the starting value");
		int start = scan.nextInt();
		System.out.println("enter the ending value");
		int end = scan.nextInt();
		int primes=0;
		for( ; start <= end ;start++)
		{
			int count=0;
			for(int i = 2 ; i <= start/2;i++)
			{
				if(start%i == 0)
					count++;
			}
			if(count==0)
			{  System.out.println("prime -> "+start);
				primes++;
			}
		}
		System.out.println("total primes -> "+primes);
		
		scan.close();
	}

}

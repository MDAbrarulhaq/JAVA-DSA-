public class armstrongNumber {
	public static void main(String[] args) {
// 		System.out.println("Hello World");
     double sum =0;
     int num = 153;
     int temp =num;
     int length = String.valueOf(Math.abs(num)).length();
     while(num>0)
     {
         int rem = num%10;
         sum = sum + Math.pow(rem,length);
         num  = num/10;
     }
     
     if(temp==sum)
        System.out.println("Armstrong");
    else
      System.out.println("not armstrong");
	}
}
class Amr
{
    public static  void main(String[] args)
    {
       
        int num = 153;
        int temp = num;
        int count = 0;
        int exponent = 0;
        while(temp != 0)
        {
            count++;
            temp = temp/10;
        
        System.out.println("Count of digits: " + count);
        while(num != 0)
        {
            int digit = num % 10;
           for (int i = 1; i <= count; i++)
           {
               exponent = exponent + digit*digit;            
           }
            num = num / 10;
        }
        System.out.println("Sum of digits raised to the power of count: " + exponent);
        if(exponent == temp)
        {
            System.out.println("The number is an Armstrong number.");
        }
        else
        {
            System.out.println("The number is not an Armstrong number.");
        }

    }
}

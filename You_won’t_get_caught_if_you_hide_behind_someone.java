// File Name: Count_Greater_Than_K.java

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Scanner to take input from user
        Scanner scan = new Scanner(System.in);

        // Number of test cases
        int t = scan.nextInt();

        // Loop for each test case
        while(t-- > 0)
        {
            int count = 0; // To count elements greater than k

            // Input size of array and value of k
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] a = new int[n];

            // Reading array elements
            for(int i = 0; i < n; i++)
            {
                a[i] = scan.nextInt();

                // If element is greater than k, increase counter
                if(a[i] > k)
                {
                    count++;
                }
            }

            // Output result for this test case
            System.out.println(count);
        }
    }
}
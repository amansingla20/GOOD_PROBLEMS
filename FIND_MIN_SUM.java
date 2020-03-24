import java.util.*;
import java.io.*;
public class FIND_MIN_SUM
{
    static int MIN_SUM_CALCULATE(int arr[], int n)
    {
        Arrays.sort(arr);
        int a=0; int b=0;
        for(int i=0;i<n;i++)
        {
            if(i % 2 !=0)
            a=a * 10 + arr[i];
            else
            b=b * 10 + arr[i];
        }
        System.out.println(a+"  "+b);
        return a+b;
    }
    public static void main(String[] args)
    {
        int arr[]={6 , 8 , 4 , 5 , 2 , 3};
        int n=arr.length;
        System.out.println("MIN SUM IS : "+ MIN_SUM_CALCULATE(arr, n));
    }
}
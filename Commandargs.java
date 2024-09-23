/* 1.1 Write a Java program that accepts two three-digit
numbers as command line arguments and finds all palindrome
numbers between them. */

class Commandargs
{
    static int checkPal(int a)
    {
        int rev = 0;
        for(int i=a;i!=0;i/=10)
            rev = rev*10 + i%10;
        if(a==rev) return 1;
        else return 0;
    }
    static void countPal(int min, int max)
    {
        for(int i= min+1; i<max ; i++)
        {
            if(checkPal(i)==1)
                System.out.print(i+" . ");
        }
    }
    public static void main(String args[])
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        countPal(num1,num2);
    }
}

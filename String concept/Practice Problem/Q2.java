import java.util.*;
public class Q2
{
    static boolean isPalindromeIterative(String text)
    {
        int i=0;
        int j=text.length()-1;
        while(i<j)
        {
            if(text.charAt(i)!=text.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindromeRecursive(String text)
    {
        return recursiveCheck(text,0,text.length()-1);
    }
    static boolean recursiveCheck(String text,int i,int j)
    {
        if(i>=j)
        {
            return true;
        }
        if(text.charAt(i)!=text.charAt(j))
        {
            return false;
        }
        return recursiveCheck(text,i+1,j-1);
    }
    static boolean isPalindromeArrayReversal(String text)
    {
        char[] arr=text.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return text.equals(new String(arr));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        boolean iterative=isPalindromeIterative(text);
        boolean recursive=isPalindromeRecursive(text);
        boolean arrayReversal=isPalindromeArrayReversal(text);
        System.out.println("Iterative: "+(iterative?"Palindrome":"Not Palindrome"));
        System.out.println("Recursive: "+(recursive?"Palindrome":"Not Palindrome"));
        System.out.println("Array Reversal: "+(arrayReversal?"Palindrome":"Not Palindrome"));
        sc.close();
    }
}

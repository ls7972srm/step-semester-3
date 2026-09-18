import java.util.Scanner;
public class Q5 
{
    public static void classifyWordLengths(String review) 
  {
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;
        String[] words = review.split(" ");
        for (String word : words) 
        {
            int length = word.length();
            if (length >= 1 && length <= 4) 
            {
                shortCount++;
            }
            else if (length >= 5 && length <= 8) 
            {
                mediumCount++;
            } 
            else 
            {
                longCount++;
            }
        }
        System.out.println("Short: " + shortCount);
        System.out.println("Medium: " + mediumCount);
        System.out.println("Long: " + longCount);
    }
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie review: ");
        String review = sc.nextLine();
        classifyWordLengths(review);
        sc.close();
    }
}

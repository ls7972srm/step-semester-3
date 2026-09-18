import java.util.Scanner;
public class Q2 
{
    public static String reverseEachWord(String sentence) 
  {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words)
          {
            StringBuilder reversed = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) 
            {
                reversed.append(word.charAt(i));
            }
            result += reversed.toString() + " ";
        }
        return result.trim();
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Output: " + reverseEachWord(sentence));
        sc.close();
    }
}

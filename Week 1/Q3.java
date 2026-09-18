import java.util.Scanner;
public class Q3
  {
    public static void findLongestStreak(String signalLog) 
    {
        int maxStreak = 1;
        int currentStreak = 1;
        char longestColor = signalLog.charAt(0);
        for (int i = 1; i < signalLog.length(); i++)
          {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) 
            {
                currentStreak++;
            } 
            else 
            {
                currentStreak = 1;
            }
            if (currentStreak > maxStreak) 
            {
                maxStreak = currentStreak;
                longestColor = signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + longestColor +
                "' repeated " + maxStreak + " times");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();
        findLongestStreak(signalLog);
        sc.close();
    }
}

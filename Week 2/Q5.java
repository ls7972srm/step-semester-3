import java.util.*;
public class Q5 
{
    public static void printFilteredWordFrequency(String feedback) 
  {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        HashSet<String> stopSet = new HashSet<>();
        for (String word : stopWords) 
        {
            stopSet.add(word);
        }
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");
        String[] words = feedback.split("\\s+");
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String word : words) 
        {
            if (!stopSet.contains(word)) 
            {
                if (frequency.containsKey(word))
                {
                    frequency.put(word, frequency.get(word) + 1);
                }
                else 
                {
                    frequency.put(word, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(frequency.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : list) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);
        sc.close();
    }
}

import java.util.*;
public class Q4
{
    static void analyzeInventory(int[] sectionA,int[] sectionB)
    {
        int totalA=0;
        int totalB=0;
        for(int i=0;i<sectionA.length;i++)
        {
            totalA+=sectionA[i];
            totalB+=sectionB[i];
        }
        String status;
        if(totalA==totalB)
        {
            status="Balanced";
        }
        else
        {
            status="Not Balanced";
        }
        int highest=sectionA[0];
        String section="Section A";
        int index=0;
        for(int i=0;i<sectionA.length;i++)
        {
            if(sectionA[i]>highest)
            {
                highest=sectionA[i];
                section="Section A";
                index=i;
            }
            if(sectionB[i]>highest)
            {
                highest=sectionB[i];
                section="Section B";
                index=i;
            }
        }
        System.out.println("Section A Total: "+totalA);
        System.out.println("Section B Total: "+totalB);
        System.out.println("Status: "+status);
        System.out.println("Highest Quantity: "+highest+" ("+section+", Item "+(index+1)+")");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=sc.nextInt();
        int[] sectionA=new int[n];
        int[] sectionB=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Section A quantity for item "+(i+1)+": ");
            sectionA[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Section B quantity for item "+(i+1)+": ");
            sectionB[i]=sc.nextInt();
        }
        analyzeInventory(sectionA,sectionB);
        sc.close();
    }
}

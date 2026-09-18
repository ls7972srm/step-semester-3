import java.util.Scanner;
public class TravelComputation 
{
    public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        String name;
        String fromCity;
        String viaCity;
        String toCity;
        name = input.nextLine();
        fromCity = input.nextLine();
        viaCity = input.nextLine();
        toCity = input.nextLine();
        double fromToVia;
        double viaToFinalCity;
        fromToVia = input.nextDouble();
        viaToFinalCity = input.nextDouble();
        int timeFromToVia;
        int timeViaToFinalCity;
        timeFromToVia = input.nextInt();
        timeViaToFinalCity = input.nextInt();
        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes");
    }
}

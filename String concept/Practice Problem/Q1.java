import java.util.*;
public class Q1
{
    static String playRound(String playerMove,String computerMove)
    {
        if(playerMove.equals(computerMove))
        {
            return "Draw";
        }
        if((playerMove.equals("Rock")&&computerMove.equals("Scissors"))||
           (playerMove.equals("Paper")&&computerMove.equals("Rock"))||
           (playerMove.equals("Scissors")&&computerMove.equals("Paper")))
        {
            return "Player Wins";
        }
        return "Computer Wins";
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int N=5;
        String[] moves={"Rock","Paper","Scissors"};
        String[] playerMoves=new String[N];
        String[] computerMoves=new String[N];
        String[] results=new String[N];
        int wins=0;
        int losses=0;
        int draws=0;
        for(int i=0;i<N;i++)
        {
            System.out.print("Round "+(i+1)+" - Enter your move (Rock/Paper/Scissors): ");
            playerMoves[i]=sc.next();
            computerMoves[i]=moves[random.nextInt(3)];
            results[i]=playRound(playerMoves[i],computerMoves[i]);
            if(results[i].equals("Player Wins"))
            {
                wins++;
            }
            else if(results[i].equals("Computer Wins"))
            {
                losses++;
            }
            else
            {
                draws++;
            }
            System.out.println("Computer Move: "+computerMoves[i]);
            System.out.println("Result: "+results[i]);
            System.out.println();
        }
        System.out.println("========== FINAL SUMMARY ==========");
        System.out.printf("%-8s %-15s %-15s %-15s%n","Round","Player Move","Computer Move","Result");
        System.out.println("--------------------------------------------------------------");
        for(int i=0;i<N;i++)
        {
            System.out.printf("%-8d %-15s %-15s %-15s%n",i+1,playerMoves[i],computerMoves[i],results[i]);
        }
        double winPercentage=((double)wins/N)*100;
        System.out.println("\n========== SCOREBOARD ==========");
        System.out.println("Wins   : "+wins);
        System.out.println("Losses : "+losses);
        System.out.println("Draws  : "+draws);
        System.out.printf("Win %%  : %.1f%%%n",winPercentage);
        sc.close();
    }
}

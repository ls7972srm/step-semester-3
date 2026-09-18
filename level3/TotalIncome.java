import java.util.Scanner;
public class TotalIncome 
{
    public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        double salary;
        double bonus;
        salary = input.nextDouble();
        bonus = input.nextDouble();
        double income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + income);
    }
}

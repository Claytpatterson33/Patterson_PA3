import java.text.DecimalFormat;
public class SavingsAccount {
    private static double annualInterestRate;
    public static DecimalFormat df = new DecimalFormat("#,###,##0.00");

    public static int num = 1;

    private double savingsBalance;

    public static SavingsAccount saver1 = new SavingsAccount();

    public static SavingsAccount saver2 = new SavingsAccount();

    public static double calculateMonthlyInterest(double a)
    {
        return (a * annualInterestRate) / 12;
    }
    public static void modifyInterestRate()
    {
        if (num == 12)
        {
            annualInterestRate = .05;
        }
        else
            annualInterestRate = .04;
        num++;
    }
    public static void main(String[] args)
    {

        saver1.savingsBalance = 2000.00;

        saver2.savingsBalance = 3000.00;

        for(int i = 1; i<=12; i++)
        {
            modifyInterestRate();
            saver1.savingsBalance += calculateMonthlyInterest(saver1.savingsBalance);
            saver2.savingsBalance += calculateMonthlyInterest(saver2.savingsBalance);
            System.out.format("Month %d: \n", i);
            System.out.println(df.format(saver1.savingsBalance) + " " + df.format(saver2.savingsBalance)+ " ");
        }
        saver1.savingsBalance += calculateMonthlyInterest(saver1.savingsBalance);
        saver2.savingsBalance += calculateMonthlyInterest(saver2.savingsBalance);
        System.out.println("With 5%: Next Month");
        System.out.print(df.format(saver1.savingsBalance) + " " + df.format(saver2.savingsBalance));


    }
}
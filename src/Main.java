import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int months = 12;
        final int percent = 100;
        int principal;
        float intRate;
        int period;

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Principal($1K-$1M): ");
            principal = scan.nextInt();
            if (principal<1_000 || principal>1_000_000)
                System.out.println("Enter a number between 1,000 and 1,000,000.");
            else
                break;
        }

        while (true){
            System.out.print("Annual Interest Rate: ");
            intRate = scan.nextFloat();
            if (intRate<=0 || intRate>30)
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            else
                break;
        }
        float monthlyInterest = intRate/months/percent;

        while (true){
            System.out.print("Period(Years): ");
            period = scan.nextInt();
            if (period<=0 || period>30)
                System.out.println("Enter a value between 1 and 30");
            else
                break;
        }
        int periodMonthly = period * months;

        double mortgage = principal*monthlyInterest*((Math.pow((1+monthlyInterest),periodMonthly))/((Math.pow((1+monthlyInterest),periodMonthly)-1)));
        String finalMortgage =  NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + finalMortgage);
    }
}
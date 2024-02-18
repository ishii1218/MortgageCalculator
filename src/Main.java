import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int months = 12;
        final int percent = 100;

        Scanner scan = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scan.nextInt();
        System.out.print("Annual Interest Rate: ");
        float intRate = scan.nextFloat();
        float monthlyInterest = intRate/months/percent;

        System.out.print("Period(Years): ");
        int period = scan.nextInt();
        int periodMonthly = period * months;

        double mortgage = principal*monthlyInterest*((Math.pow((1+monthlyInterest),periodMonthly))/((Math.pow((1+monthlyInterest),periodMonthly)-1)));
        String finalMortgage =  NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + finalMortgage);

    }

}
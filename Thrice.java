import java.util.Scanner;

public class Thrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean retired = false;
        int count = 3;
        int num = 1;
        int tally = 0;
        int tally1 = 0;
        int tally2 = 0;
        int tally3 = 0;
        int round2 = 0;
        String retire;

        while (count > 0) {
            int roll = (int) (Math.random() * 6 + 1);
            System.out.println("Roll #" + num + " = " + roll);
            count--;
            num++;
            tally = tally + roll;
            tally = tally1;
            round2 = roll;
        }
        count = 3;
        num = 0;
        System.out.println("Tally = " + tally1);
        System.out.println("Rolls in Round 2: " + round2);

        while (round2 > 0) {
            int roll = (int) (Math.random() * 6 + 1);
            System.out.println("Roll #" + num + " = " + roll);
            round2--;
            num++;
            tally = tally + roll;
            tally = tally2;
        }

        System.out.println("Tally = " + tally2);

        System.out.println("Would you like to retire? ('yes' or 'no')");
        retire = scan.nextLine();

        num = 0;

        if (retire.equals("yes")) {
            retired = true;
        }

        else if (retire.equals("no")) {
            while (count > 0) {
                int roll = (int) (Math.random() * 6 + 1);
                System.out.println("Roll #" + num + " = " + roll);
                count--;
                num++;
                tally = tally + roll;
                tally = tally3;
            }
        }
        int finalTally = tally1 + tally2 + tally3;
        System.out.println("Final tally = " + finalTally);
    }
}
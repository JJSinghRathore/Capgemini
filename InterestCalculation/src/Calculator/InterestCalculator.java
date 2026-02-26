package Calculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator–SB");
            System.out.println("2. Interest Calculator–FD");
            System.out.println("3. Interest Calculator–RD");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.println("Enter the Average amount in your account:");
                        double amount = sc.nextDouble();
                        System.out.println("Enter account type (Normal/NRI):");
                        String type = sc.next();

                        SBAccount sb = new SBAccount(amount, type);
                        System.out.println("Interest gained: Rs. " + sb.calculateInterest());
                        break;

                    case 2:
                        System.out.println("Enter the FD amount:");
                        double fdAmount = sc.nextDouble();
                        System.out.println("Enter the number of days:");
                        int days = sc.nextInt();
                        System.out.println("Enter your age:");
                        int age = sc.nextInt();

                        FDAccount fd = new FDAccount(fdAmount, days, age);
                        System.out.println("Interest gained is: " + fd.calculateInterest());
                        break;

                    case 3:
                        System.out.println("Enter the monthly RD amount:");
                        double rdAmount = sc.nextDouble();
                        System.out.println("Enter number of months:");
                        int months = sc.nextInt();
                        System.out.println("Enter your age:");
                        int rdAge = sc.nextInt();

                        RDAccount rd = new RDAccount(rdAmount, months, rdAge);
                        System.out.println("Interest gained is: " + rd.calculateInterest());
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Option");
                }

            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
package Day2.InterestCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int choice;
    boolean flag = true;
    while(flag){

        System.out.println("1. FD");
        System.out.println("2. SB");
        System.out.println("3. RD");
        System.out.println("4. Exit");
        System.out.println("Select the type of account:");
        choice = sc.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter the FD amount:");
                    double fdAmount = sc.nextDouble();
                    System.out.println("Enter the no. of days:");
                    int days = sc.nextInt();
                    System.out.println("Enter your age:");
                    int fdAge = sc.nextInt();
                    FDAccount fd = new FDAccount(fdAmount, fdAge, days);
                    System.out.println("Interest gained is: " + fd.calculateInterest());
                    break;
                case 2:
                    System.out.println("Enter the Average amount in your account:");
                    double avgAmount = sc.nextDouble();
                    System.out.println("Enter account type (Normal/NRI):");
                    String type = sc.next();
                    SBAccount sb = new SBAccount(type, avgAmount);
                    System.out.println("Interest gained:" + sb.calculateInterest());
                    break;
                case 3:
                    System.out.println("Enter the RD monthly amount:");
                    double rdAmount = sc.nextDouble();
                    System.out.println("Enter the number of months:");
                    int months = sc.nextInt();
                    System.out.println("Enter your age:");
                    int rdAge = sc.nextInt();
                    RDAccount rd = new RDAccount(months, rdAmount, rdAge);
                    System.out.println("Interest gained:" + rd.calculateInterest());
                    break;
                case 4:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
        catch(Exception e){
            System.out.println("Some invalid choices have been made by you");
        }
    }
    }
}

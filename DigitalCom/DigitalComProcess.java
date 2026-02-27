package Day1.DigitalCom;

import java.util.Scanner;

public class DigitalComProcess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean valid=true;
        User user=new User();
        GameServices game=new GameServices();
        while(valid) {
            System.out.println("----Main Menu - Choices-----");
            System.out.println("1) RegisterUser");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter userid and password");
                    String userid = sc.next();
                    String password = sc.next();
                    user.addUser(userid, password);
                    break;
                case 2:
                    System.out.println("Enter userid and password to login");
                    if (user.IsAuthenticated(sc.next(),sc.next())) {
                        while(true){
                            System.out.println("Enter your choice: ");
                            System.out.println("4) ViewGames");
                            System.out.println("5) searchGames");

                            int ch=sc.nextInt();
                            switch (ch) {
                                case 4:
                                    game.viewAll().forEach(System.out::println);
                                    break;
                                case 5:
                                    System.out.println("Enter authorName to search its game");
                                    System.out.println(game.authorSearch(sc.next()));
                                    break;
                            }
                        }
                    }else{
                        System.out.println("Invalid username or password");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using our DigitalCom2.");
                    valid=false;
                    break;
            }
        }

    }
}

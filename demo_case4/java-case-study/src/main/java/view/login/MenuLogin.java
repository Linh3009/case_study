package view.login;

import action.CheckLogin;
import model.User;
import view.MainMenu;

import java.util.List;
import java.util.Scanner;

public class MenuLogin {
    public static void show(List<User> users) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("╔=====================================╗");
            System.out.println("║    ▂ ▃ ▅ ▆ █ LOGIN MENU █ ▆ ▅ ▃ ▂   ║");
            System.out.println("╠=====================================╣");
            System.out.println("║ 1. Login                            ║");
            System.out.println("║ 2. Register                         ║");
            System.out.println("║ 3. Exit                             ║");
            System.out.println("╚=====================================╝");

            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    MainMenu.show(users);
                    break;
                case 2:
                    System.out.println("case create user");
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}

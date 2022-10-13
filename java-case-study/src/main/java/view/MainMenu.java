package view;

import action.CheckLogin;
import common.Constains;
import io.HandleFile;
import model.Product;
import model.User;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void show(List<User> users) {
        User user = CheckLogin.execute(users);
        if (user != null) {
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;

            while (flag) {
                System.out.println("1. User");
                System.out.println("2. Product");
                System.out.println("3. Exit");

                System.out.println("Enter choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("case user");
                        break;
                    case 2:
                        List<Product> products = HandleFile.readDataFromFile(Constains.pathProducts());
                        MenuProduct.show(user, products);
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("Please try again");
            show(users);
        }
    }
}

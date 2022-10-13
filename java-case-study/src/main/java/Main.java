import action.AddMockData;
import action.CheckFile;
import common.Constains;
import io.HandleFile;
import model.User;
import view.login.MenuLogin;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (CheckFile.isExist(Constains.pathUsers()) || CheckFile.isExist(Constains.pathProducts())) {
            return;
        }

        List<User> users = HandleFile.readDataFromFile(Constains.pathUsers());
        if (users.isEmpty()) {
            AddMockData.executeUser();
            AddMockData.executeProduct();
        }

        MenuLogin.show(users);
    }
}

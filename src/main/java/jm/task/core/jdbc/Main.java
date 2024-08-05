package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("R", "S", (byte) 2);
        userService.saveUser("Q", "P", (byte) 22);
        userService.saveUser("F", "V", (byte) 96);
        userService.saveUser("L", "X", (byte) 15);

        List<User> list = new ArrayList<>();

        list = userService.getAllUsers();

        for (User user : list) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

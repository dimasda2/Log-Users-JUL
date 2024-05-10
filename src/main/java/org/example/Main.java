package org.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"John Doe", "john@example.com");
        User user2 = new User(2,"Jane Smith", "jane@example.com");

        UserDao userDao = new UserDao() {
            @Override
            public void addUser(User user) {

            }

            @Override
            public void updateUser(User user) {

            }

            @Override
            public void deleteUser(int userId) {

            }

            @Override
            public User getUserById(int userId) {
                return null;
            }

            @Override
            public List<User> getAllUsers() {
                return List.of();
            }
        };
        UserService userService = new UserService(userDao);
        userService.addUser(user1);
        userService.addUser(user2);

        System.out.println("Список користувачів:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}
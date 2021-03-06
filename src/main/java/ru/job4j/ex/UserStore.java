package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (login.equals(value.getUsername())) {
                user = value;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("");
        }
        System.out.println("This user has an access");
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException e) {
            e.printStackTrace();
            System.out.println("Invalid user!");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println("User not found!");
        }
    }
}

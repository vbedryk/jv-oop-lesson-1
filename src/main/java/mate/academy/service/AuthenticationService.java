package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    /**
     * Imagine that some user wants to login to your site.
     * You should check if user credentials (login and password) are valid or not.
     * All users are stored in <code>UserService</code> class.
     * @param email - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    private final UserService userService = new UserService();

    public boolean login(String email, String password) {
        User foundUser = userService.findByEmail(email);
        return userService.findByEmail(email) != null && foundUser.getPassword().equals(password);
    }
}

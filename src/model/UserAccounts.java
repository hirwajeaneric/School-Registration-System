package model;

/**
 *
 * @author hirwa
 */
public class UserAccounts {
    private String username;
    private String phoneNumber;
    private String password;
    private String confirmPassword;

    public UserAccounts() {
    }

    public UserAccounts(String username, String phoneNumber, String password, String confirmPassword) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}

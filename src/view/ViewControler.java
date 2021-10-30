package view;

public class ViewControler {
    
    public static void main(String[] args){
        ARS sys = new ARS();
        sys.setVisible(true);
    }
    
    //Method to open the login form
    public void openSignInForm(){
        SignInForm sign = new SignInForm();
        sign.setVisible(true);
    }    
    
    //Method to close the signin form
    public void closeSignInForm(){
        LoginForm lgf = new LoginForm();
        lgf.setVisible(false);
    }
    
    //Method to open the signin form
    public void openLoginForm(){
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
    }
    
    //Method to close the signin form
    public void closeLoginForm(){
        LoginForm lgf = new LoginForm();
        lgf.setVisible(false);
    }
    
    //Method to open the MDI form
    public void openRegistrationForm(){
        MainSystem main = new MainSystem();
        main.setVisible(true);
    }
}

public class PasswordVerifier {

    public boolean verify(String password) {

        if (passwordDoesNotContainLowerCase(password)){
            return false;
        }
        if (passwordDoesNotContainUpperCase(password)){
            return false;
        }

        return true;
    }

    private boolean passwordDoesNotContainLowerCase(String password){
        return password.equals(password.toUpperCase());
    }
    private boolean passwordDoesNotContainUpperCase(String password){
        return password.equals(password.toLowerCase());
    }

}

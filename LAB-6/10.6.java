class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class RegistrationForm {
    private String email;
    private String password;
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.indexOf("@") < email.lastIndexOf(".") && email.lastIndexOf(".") < email.length() - 1;
    }

    public RegistrationForm(String email, String password) throws InvalidEmailException, WeakPasswordException {
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Incorrect email format");
        }

        if (password.length() < 8) {
            throw new WeakPasswordException("The password is too short");
        }

        this.email = email;
        this.password = password;
    }    
}
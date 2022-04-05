package mk.ukim.finki.eshop.model.exceptions;

public class UsernameAlreadyExists extends RuntimeException {
    public UsernameAlreadyExists(String username) {
            super(String.format("User with username %s already exists", username));
    }
}

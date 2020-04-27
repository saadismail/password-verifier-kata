import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*
There needs to be at least 1 uppercase letter.
There needs to be at least 1 lowercase letter.
There needs to be at least 1 number.
The password needs to be at least 8 characters long.
 */

public class PasswordVerifierShould {
    @Test
    public void doSomething() {
        assertEquals(1, 1);
    }

    @Test
    public void FailWhenNoUpperCase(){
        String password = "mehdi";
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        assertEquals(false, passwordVerifier.verify(password));
    }

    @Test
    public void FailWhenNoLowerCase(){
        String password = "MEHDI";
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        assertEquals(false, passwordVerifier.verify(password));
    }

    @Test
    public void PassWhenGoodPassword(){
        String password = "AbcdefGhijKlmnopQRsTuvwxyZ1234567890";
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        assertEquals(true, passwordVerifier.verify(password));
    }

}

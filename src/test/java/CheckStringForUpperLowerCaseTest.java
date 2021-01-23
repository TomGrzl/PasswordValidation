import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckStringForUpperLowerCaseTest {

    @Test
    public void checkStringForUpperCaseTest() {
        //given
        String password = "password";

        //when
        boolean result = PasswordValidation.checkStringForUpperCase(password);

        //then
        assertEquals(false, result);

    }

    @Test
    public void checkStringForLowerCaseTest() {
        //given
        String password = "Password";

        //when
        boolean result = PasswordValidation.checkStringForLowerCase(password);

        //then
        assertEquals(true, result);

    }

}

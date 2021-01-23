import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckStringForNumbersTest {

    @Test
    public void checkStringForNumbersTest() {
        //given
        String password = "Password";

        //when
        boolean result = PasswordValidation.checkStringForNumbers(password);

        //then
        assertEquals(false, result);

    }

}

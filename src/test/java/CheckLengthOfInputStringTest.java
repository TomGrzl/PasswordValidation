import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckLengthOfInputStringTest {

    @Test
    public void checkLengthOfInputStringTest() {
        //given
        String password = "Pa";

        //when
        boolean result = PasswordValidation.checkLengthOfInputString(password);

        //then
        assertFalse(result);
    }

}

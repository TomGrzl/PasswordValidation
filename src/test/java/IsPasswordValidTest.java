import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPasswordValidTest {

    @Test
    public void isPasswordValidTest() {
        //given
        String password = "ha";

        //when
        String result = PasswordValidation.isPasswordValid(password);

        //then
        assertEquals(PasswordValidation.isPasswordValid(PasswordValidation.getInputString()), result);

    }

}

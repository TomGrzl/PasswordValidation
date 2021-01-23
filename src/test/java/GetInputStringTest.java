import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetInputStringTest {

    @Test
    public void getInputStringTest() {
        //given
        String password = "Password";


        //when
        String result = PasswordValidation.getInputString();

        //then
        assertEquals(password, result);

    }

}

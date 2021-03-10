import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkPasswordAssertion {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}


    @Test
    void testmycheckPassword_Scenario1(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("Password0815!");
        Boolean expected = true;
        assertEquals(expected, actual);
    }



    @Test
    void testmycheckPassword_Scenario2(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("Pferdekutsche");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario3(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("$GetMoney$2018!!");
        Boolean expected = true;
        assertEquals(expected, actual);
    }


}

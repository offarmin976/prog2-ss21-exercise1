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
        Boolean actual = cPC.checkPassword("Ab3!efg");  //Testbeispiel für Rule1: 8 - 25 Zeichen
        Boolean expected = false;                              //Test: False weil 7 Zeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario2(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcdefghijklmnopqrstuvwxy!z13fssdfs");  //Testbeispiel für Rule1: 8 - 25 Zeichen
        Boolean expected = false;                               //Test: False weil über 25Zeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario3(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("AbCdE!g");  //Testbeispiel für Rule4: Nummer verfügbar
        Boolean expected = false;                               //Test: False weil keine Zahl
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario4(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcdefg2!");     //Tesstbeispiel für Rule2: Großschriebung
        Boolean expected = false;                                   //Test: False weil kein großer Character
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario5(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("ABCDEFGH2!");     //Tesstbeispiel für Rule2: Kleinschreibung
        Boolean expected = false;                                   //Test: False weil kein kleiner Character
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario6(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcdefg!");     //Tesstbeispiel für Rule2: Großschriebung
        Boolean expected = false;                                   //Test: False weil kein großer Character
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario7(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("Abcdefg34");     //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = false;                                   //Test: False weil kein  Sonderzeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario8(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("Abc2defg!");     //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = true;                                   //Test: True weil ! Sonderzeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario9(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcDefg1?");    //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = true;                                   //Test: True weil ? Sonderzeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario10(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcDefg1#");    //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = true;                                   //Test: True weil # Sonderzeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario11(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcDefg1(");    //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = true;                                   //Test: True weil ( Sonderzeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario12(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcDefg1)");    //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = true;                                   //Test: True weil ) Sonderzeichen
        assertEquals(expected, actual);
    }

    @Test
    void testmycheckPassword_Scenario13(){
        checkPasswordClass cPC = new checkPasswordClass();
        Boolean actual = cPC.checkPassword("abcDefg1?");    //Tesstbeispiel für Rule4: Sonderzeichen
        Boolean expected = false;                                   //Test: True weil ? Sonderzeichen
        assertEquals(expected, actual);
    }




}

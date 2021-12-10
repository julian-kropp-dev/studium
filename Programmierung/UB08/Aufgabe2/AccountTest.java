package UB08.Aufgabe2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    Account test;

    @BeforeEach
    void setUp() {
        test = new Account("Kjell", 187);
    }

    @Test
    void testAuszahlen() {
        // Überprüfen auf Randfälle und Disposition
        for (int i = -1; i < 1; i++) {
            assertEquals(false, test.auszahlen(i));
        }
        assertEquals(false, test.auszahlen(200));
        // Überprüfen auf richtige Funktion
        assertEquals(true, test.auszahlen(1));
        assertEquals(186, test.balance());
    }

    @Test
    void testBalance() {
        // Überprüfen auf Randfälle entfällt, da keine Argumente akzeptiert werden
        // Überprüfen auf richtige Funktion
        assertEquals(187, test.balance());
    }

    @Test
    void testEinzahlen() {
        // Überprüfen auf Randfälle
        for (int i = -1; i < 1; i++) {
            assertEquals(false, test.einzahlen(i));
        }
        // Überprüfen auf richtige Funktion
        assertEquals(true, test.einzahlen(1));
        assertEquals(188, test.balance());
    }

    @Test
    void testOwner() {
        // Überprüfen auf Randfälle entfällt, da jeder String gültig ist und keine
        // anderen Typen akzeptiert werden
        // Überprüfen auf richtige Funktion
        assertEquals("Kjell", test.owner());
        test.owner("Birk");
        assertEquals("Birk", test.owner());
    }

    @Test
    void testTransfer() {
        Account test2 = new Account("Birk", 420);
        // Überprüfen auf Randfälle
        for (int i = -1; i < 1; i++) {
            assertEquals(false, test.transfer(i, test2));
        }
        assertEquals(false, test.transfer(1, test));
        assertEquals(false, test.transfer(1000, test2));
        // Überprüfen auf richtige Funktion
        assertEquals(true, test.transfer(1, test2));
        assertEquals(186, test.balance());
        assertEquals(421, test2.balance());
    }
}

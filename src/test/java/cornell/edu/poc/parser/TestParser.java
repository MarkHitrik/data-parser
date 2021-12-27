package cornell.edu.poc.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import cornell.edu.poc.exception.DataLengthException;

class TestParser {

    private static final String EMPTY= "";
    private static final String NAME1= "Mark";
    private static final String NAME2= "M ark6 $ $";
    private static final String LONGSTRING= "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" +
        "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" +
        "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" +
        "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";

    @Test
    void testSpecialCharacters() {
        try {
            assertEquals("", Parser.parse(EMPTY));
            assertEquals("Mark", Parser.parse(NAME1));
            assertEquals("M ark6  ", Parser.parse(NAME2));
        } catch (Exception e) {
            fail("String failed test");
        }
    }

    @Test
    void testNumberOfCharacters() {
        try {
            assertThrows(DataLengthException.class,
                () -> Parser.parse(LONGSTRING));
        } catch (Exception e) {
            fail("String failed test");
        }
    }

}

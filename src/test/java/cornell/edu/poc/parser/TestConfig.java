package cornell.edu.poc.parser;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestConfig {

    @Test
    void testSpecialCharacters() {

        String foo ="";

        try {

            Properties prop = new Properties();
            prop.load(this.getClass().getResourceAsStream("/parser-rules.properties"));
            foo = prop.getProperty("testMe");
            System.out.println(foo);
        }catch(Exception e){

        }
    }
}

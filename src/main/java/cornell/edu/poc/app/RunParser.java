package cornell.edu.poc.app;

import cornell.edu.poc.exception.DataLengthException;
import cornell.edu.poc.parser.Parser;

public class RunParser {

    public static void main(String[] args) {
        try {
            String s1= args[0];
            String s2= "";
            String res= s1 != null ? s1 : s2;
            System.out.println(Parser.parse(res));
        } catch (DataLengthException e) {
            System.out.println("Exception Occured:" + e);
        }
    }

}

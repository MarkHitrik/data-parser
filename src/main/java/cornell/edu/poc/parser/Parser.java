package cornell.edu.poc.parser;

import cornell.edu.poc.exception.DataLengthException;

public class Parser {

    public static String parse(String s) throws DataLengthException {
        if (s.length() > 100) {
            throw new DataLengthException("String longer than 100 characters is not permitted.");
        }
        if (indexOfSpecialChar(s) < 0) { return s; }
        int i= indexOfSpecialChar(s);

        return s.substring(0, i) + parse(s.substring(i + 1));
    }

    public static int indexOfSpecialChar(String s) {
        char[] charArray= s.toCharArray();
        int i= 0;
        while (i < charArray.length) {
            if (!Character.isLetterOrDigit(charArray[i]) && charArray[i] != ' ') { return i; }
            i= i + 1;
        }
        return -1;
    }
}

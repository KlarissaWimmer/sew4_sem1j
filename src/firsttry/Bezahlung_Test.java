package firsttry;

/**
 * firsttry
 * Created by Klarissa Wimmer
 * am Dienstag den 19.September.2017
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class Bezahlung_Test{

    @Test
    public void testWordCount() throws Exception {
        assertEquals(1, Bezahlung.count("eins"));
        assertEquals(1, Bezahlung.count("eins"));
        assertEquals(3, Bezahlung.count("ein erster Text"));
    }
}


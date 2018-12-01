import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class PaginatorTest extends TestCase {

    private Paginator p4;
    private Paginator p160;

    @Before
    public void setUp() {
        p4 = new Paginator(4);
        p160 = new Paginator(160);
    }

    @Test
    public void testPaginator4ShortSentance(){

        String text = "AlaMaKota.";
        String[] arr = {"AlaM", "aKot", "a."};
        assertEquals(arr, p4.paginate(text));
    }

    @Test
    public void testEmptyPaginator4(){
        String text = "";
        String[] exp = {null};
        assertEquals(exp, p4.paginate(text));
    }

    @Test
    public void testPaginator160ShortSentance(){

        String text = "AlaMaKota.";
        String[] exp = {"AlaMaKota."};
        assertEquals(exp, p160.paginate(text));
    }
    @Test
    public void testPaginatorLongSentance(){

    }
}

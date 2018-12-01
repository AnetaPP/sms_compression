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
        String[] arr = {"Alam", "akot", "a."};
        assertEquals(arr, p4.paginate(text));
    }

    @Test
    public void testEmptyPaginator4(){
        String text = "";
        String exp = "";
        assertEquals(exp, p4.paginate(text));
    }

    @Test
    public void testPaginator160ShortSentance(){

        String text = "AlaMaKota.";
        String exp = "AlaMaKota.";
        assertEquals(exp, p160.paginate(text));
    }
//    @Test
//    public void testPaginatorLongSentance(){
//        File lorem = new File("C:/JAVA/Prezentacje/lorem ipsum.txt");
//        System.out.println(lorem);
//    }
}

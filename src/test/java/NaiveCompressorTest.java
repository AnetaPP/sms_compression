import compressor.Compressor;
import compressor.NaiveCompressor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;



  public class NaiveCompressorTest extends TestCase {

      private Compressor nc;

      @Before
      public void setUp() {
          nc = new NaiveCompressor();
      }

      @Test
      public void testNaiveCompressorShortCompress(){
        String text = "Ala ma kota.";
        assertEquals("AlaMaKota.", nc.compress(text));
      }

      @Test
      public void testNaiveCompressorLongCompress(){
        String text = "Ala";
        assertEquals("Ala", nc.compress(text));
      }

      @Test
      public void testNaiveCompressorUpperCaseCompress(){
          String text = "Ala ma KOTA.";
          assertEquals("AlaMaKota.", nc.compress(text));

      }
  }

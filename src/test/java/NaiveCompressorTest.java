import compressor.Compressor;
import compressor.NaiveCompressor;
import junit.framework.TestCase;

public class NaiveCompressorTest extends TestCase {

public void testNaiveCompressorShortCompress(){
    String text = "Ala ma kota";
    Compressor nc = new NaiveCompressor();
    assertEquals("AlaMaKota", nc.compress(text));

}
public void testNaiveCompressorLongCompress(){

}

}

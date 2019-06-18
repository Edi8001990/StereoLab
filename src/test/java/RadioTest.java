import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    Radio radio;

    @Before

    public void before(){
         radio = new Radio("Sony", "Tune 5000");
    }

    @Test
   public void radioHasAMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void radioHasAModel(){
        assertEquals("Tune 5000", radio.getModel());
    }

    @Test
    public void radioCanTune(){
        assertEquals("Radio 1", radio.tune());
    }



}

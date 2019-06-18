import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Panasonic", "T-1000", 5);
    }

    @Test
    public void CDplayerHasAMake(){
        assertEquals("Panasonic", cdPlayer.getMake());
    }

    @Test
    public void CDplayerHasAModel(){
        assertEquals("T-1000", cdPlayer.getModel());
    }

    @Test
    public void CDplayerHasANumberOfCds(){
        assertEquals(5, cdPlayer.getNumberOfCds());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before

    public void before(){
        recordDeck = new RecordDeck("Hitachi", "Z-1000", 2);

    }

    @Test
    public void recordHasMake(){
        assertEquals("Hitachi", recordDeck.getMake());
    }

    @Test
    public void recordHasModel(){
        assertEquals("Z-1000", recordDeck.getModel());
    }

    @Test
    public void recordHasAPlaySpeed(){
        assertEquals(2, recordDeck.getPlaySpeed());
    }
}

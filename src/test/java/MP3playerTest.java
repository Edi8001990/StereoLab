import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3playerTest {
    Stereo stereo;
    MP3player mp3player;

    @Before
    public void before(){
        mp3player = new MP3player("Apple", "I-Pod made in PRC");
        stereo = new Stereo("JVC");
    }

    @Test
    public void checkMP3playerMake(){
        assertEquals("Apple", mp3player.getMake());
    }

    @Test
    public void checkMP3playerModel(){
        assertEquals("I-Pod made in PRC", mp3player.getModel());
    }

    @Test
    public void checkIfCanConnectToStereo(){
        assertEquals("JVC", mp3player.connect(stereo));
    }
}

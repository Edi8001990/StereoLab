import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;

    @Before

    public void before(){
        stereo = new Stereo("The MEGA HI-FI");
    }

    @Test
    public void stereoHasAName(){
        assertEquals("The MEGA HI-FI", stereo.getName());
    }

    @Test
    public void stereoCanTuneARadio(){
        assertEquals("Classic FM", stereo.tune());
    }

    @Test
    public void stereoCanPlayCdPlayer(){
        assertEquals("I'm playing", stereo.play());
    }

}

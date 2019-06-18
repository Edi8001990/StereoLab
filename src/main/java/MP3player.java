public class MP3player extends Component implements IConnect {

    public MP3player(String make, String model){
        super(make, model);

    }

    public String connect(Stereo stereo) {
        return stereo.getName();

    }
}

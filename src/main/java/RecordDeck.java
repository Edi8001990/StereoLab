public class RecordDeck extends Component implements IPlay {

    private int playSpeed;

    public RecordDeck(String model, String make, int playSpeed){
        super(model, make);

        this.playSpeed = playSpeed;


    }

    public String play() {
        return "I'm playing";
    }


    public int getPlaySpeed() {
        return this.playSpeed;
    }
}

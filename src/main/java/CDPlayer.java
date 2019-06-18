public class CDPlayer extends Component implements IPlay {

    private int numberOfCDs;

    public CDPlayer(String make, String model, int numberOfCDs){
        super(make, model);

        this.numberOfCDs = numberOfCDs;

    }

    public String play() {
        return "I'm playing";
    }

    public int getNumberOfCds() {
        return this.numberOfCDs;
    }
}

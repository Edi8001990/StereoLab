public class Radio extends Component implements ITune{

    public Radio(String make, String model){
        super(make, model);
    }

    public String tune(){
        return "Classic FM";
    }
}

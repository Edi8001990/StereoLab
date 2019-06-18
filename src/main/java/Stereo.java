public class Stereo implements IPlay, ITune{
    private String name;

    public Stereo(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public String play(){
        return "I'm playing";
    }

    public String tune(){
        return "Classic FM";
    }







}

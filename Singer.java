public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public String singing(){
        return "I can singing";
    }
    public String playGuitar(){
        return "I can play guitar";
    }
    @Override
    public String toString(){
        return super.toString() + ", Band name=" + bandName;
    }
}

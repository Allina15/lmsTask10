public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void setGroupName(String groupName){
        this.groupName=groupName;
    }
    public String getGroupName(){
        return groupName;
    }
    public String dancing(){
        return "I can dancing";
    }
    @Override
    public String toString(){
        return super.toString()+", Group name= "+groupName;
    }
}

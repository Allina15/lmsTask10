public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String learn(){
        return "I can learn";
    }
    public String walk(){
        return "I can walk";
    }
    public String eat(){
        return "I can eat";
    }
    @Override
    public String toString() {
        return "Person " +
                "name= " + name +
                ", designation= " + designation ;
    }
}

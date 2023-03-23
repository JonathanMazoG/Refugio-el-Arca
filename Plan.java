public class Plan {

    private int numberOfSlots;
    private String description;
    private String nameAnimal;
   
    public Plan() {
    }

    public Plan(int numberOfSlots, String description , String name ) {
        this.numberOfSlots = numberOfSlots;
        this.description = description;
        this.nameAnimal = nameAnimal;
     }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description ;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal ;
    }

    @Override
    public String toString() {
        return "Plan{" + "description=" + description + ", numberOfSlots='" + numberOfSlots + ", nameAnimal='" + nameAnimal  '\'' + '}';
    }
}

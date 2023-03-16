public class Plan {

    private int numberOfSlots;
    private String description;
    private Animal animal;

    public Plan() {
    }

    public Plan(int numberOfSlots, String description , Animal animal) {
        this.numberOfSlots = numberOfSlots;
        this.description = description;
        this.animal = animal  // tengo dudas si esto se hace asi o no
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

    @Override
    public String toString() {
        return "Plan{" + "description=" + description + ", numberOfSlots='" + numberOfSlots + '\'' + '}';
    }
}

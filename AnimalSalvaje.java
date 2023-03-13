public class AnimalSalvaje extends Animal {

    private String dangerLevel;

    public AnimalSalvaje() {
    }

    public AnimalSalvaje(int id, String name, String dangerLevel) {
        super(id, name);
        this.dangerLevel = dangerLevel;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    @Override
    public String toString() {
        return "AnimalSalvaje{" + "dangerLevel='" + dangerLevel + '\'' + '}';
    }
}

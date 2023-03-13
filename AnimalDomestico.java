public class AnimalDomestico extends Animal {

    private String uso;

    public AnimalDomestico() {
    }

    public AnimalDomestico(int id, String name, String uso) {
        super(id, name);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "AnimalDomestico{" + "uso='" + uso + '\'' + '}';
    }


}

public class Pez extends Animal {

    private String type;

    public Pez() {
    }

    public Pez(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pez{" + "type='" + type + '\'' + '}';
    }


}
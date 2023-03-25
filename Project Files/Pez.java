public class Pez extends Animal {

    private String classification;

    public Pez() {
    }

    public Pez(int id, String name, String classification) {
        super(id, name);
        this.classification = classification;
    }

    public String getclassification() {
        return classification;
    }

    public void setclassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Pez{" + "classification='" + classification + '\'' + '}';
    }


}
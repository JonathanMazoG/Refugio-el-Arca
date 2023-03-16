public class Anfibio extends Animal {

    private String classification;

    public Anfibio() {
    }

    public Anfibio(int id, String name, String classification) {
        super(id, name);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.uso = classification;
    }

    @Override
    public String toString() {
        return "Abfibio{" + "classification='" + classification + '\'' + '}';
    }


}
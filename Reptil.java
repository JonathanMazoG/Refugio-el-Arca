public class Reptil extends Animal {

    private String classification;

    public Reptil() {
    }

    public Reptil(int id, String name, String classification) {
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
        return "Reptil{" + "classification='" + classification + '\'' + '}';
    }


}

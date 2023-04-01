public class Anfibio extends Animal {

    private String classification;

    public Anfibio() {
    }

    
    public Anfibio(int id, String name, String stage, String classification) {
        super(id, name, stage);
        this.classification = classification;
    }


    public Anfibio(String classification) {
        this.classification = classification;
    }


    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Abfibio{" + "classification='" + classification + '\'' + '}';
    }


}
public class Pez extends Animal {

    private String classification;

    public Pez() {
    }

  
    public Pez(int id, String name, String stage, String classification) {
        super(id, name, stage);
        this.classification = classification;
    }


    public Pez(String classification) {
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
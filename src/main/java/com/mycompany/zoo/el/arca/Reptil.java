public class Reptil extends Animal {

    private String classification;

    public Reptil() {
    }

  
    public Reptil(int id, String name, String stage, String classification) {
        super(id, name, stage);
        this.classification = classification;
    }


    public Reptil(String classification) {
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
        return "Reptil{" + "classification='" + classification + '\'' + '}';
    }


}

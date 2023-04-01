public class Mamifero extends Animal {

    private String classification;

    public Mamifero() {
    }

   
    public Mamifero(int id, String name, String stage, String classification) {
        super(id, name, stage);
        this.classification = classification;
    }


    public Mamifero(String classification) {
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
        return "Mamifero{" + "classification='" + classification + '\'' + '}';
    }


}

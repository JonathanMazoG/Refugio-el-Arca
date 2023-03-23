public class Mamifero extends Animal {

    private String classification;

    public Mamifero() {
    }

    public Mamifero (int id, String name, String classification) {
        super(id, name);
        this.classification = classification ;
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

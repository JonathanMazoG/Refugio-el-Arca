public class Mamifero extends Animal {

    private String group;

    public Mamifero() {
    }

    public Mamifero (int id, String name, String group) {
        super(id, name);
        this.group = group ;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "group='" + group + '\'' + '}';
    }


}

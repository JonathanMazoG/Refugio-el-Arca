public class Animal {

    private int id;
    private String name;
    private String stage;

 
 
    public Animal(int id, String name, String stage) {
        this.id = id;
        this.name = name;
        this.stage = stage;
    }
    
    
    public Animal() {
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

  
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

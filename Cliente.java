public class Cliente {

    private int id;
    private String name;
    private int age;
    private String tipo;

    public Cliente(int id, String name, int age, String tipo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tipo = tipo;
    }
    public Cliente() {
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

     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name='" + name +  ", age='" + age + '\'' + '}';
    }
}

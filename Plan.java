public abstract class Plan {

    private int numberOfSlots;
    private String description;
    private String tipoAnimal;
    private double precio;
    
    protected Plan(int numberOfSlots, String description, String tipoAnimal, double precio) {
        this.numberOfSlots = numberOfSlots;
        this.description = description;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }
    
    public int getNumberOfSlots() {
        return numberOfSlots;
    }
    
    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description ;
    }
    
    public String gettipoAnimal() {
        return tipoAnimal;
    }
    
    public void settipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal ;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Plan{" + "description=" + description + ", numberOfSlots='" + numberOfSlots + ", tipoAnimal='" + tipoAnimal  +'\'' + '}';
    }
    
    public abstract double calcularCosto();
};
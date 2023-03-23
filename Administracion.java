import java.util.ArrayList;


public class Administracion {
    private ArrayList<Cliente> clientes;
    private ArrayList<Plan> planes;
    private ArrayList<Boleta> boletas;
    private ArrayList<Animal> animales;


    public Administracion(ArrayList<Cliente> clientes, ArrayList<Plan> planes, ArrayList<Boleta> boletas,
            ArrayList<Animal> animales) {
        this.clientes = clientes;
        this.planes = planes;
        this.boletas = boletas;
        this.animales = animales;
    }

    public Administracion() {
    }

    public ArrayList<Cliente> ingresoCliente(Cliente cliente,ArrayList<Cliente> clientes){
        if(cliente.getNumVisitas()>=10){
            cliente.setTipo("Frecuente");
        }
        cliente.setNumVisitas(cliente.getNumVisitas()+1);
        clientes.add(cliente);
        return clientes;
    }

    public ArrayList<Animal> ingresoAnimal(Animal animal,ArrayList<Animal> animales){
        animales.add(animal);
        return animales;
    }

    public ArrayList<Boleta> ingresoBoleta(Boleta boleta,ArrayList<Boleta> boletas){
        boletas.add(boleta);
        return boletas;
    }
    public ArrayList<Plan> ingresoPlan(Plan plan,ArrayList<Plan> planes){
        planes.add(plan);
        return planes;
    }

    
}

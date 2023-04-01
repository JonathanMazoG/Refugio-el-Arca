
import java.util.ArrayList;


public class Administracion {
    
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

    public ArrayList<Suministro> ingresoSuministro(Suministro suministro,ArrayList<Suministro> suministros){
        suministros.add(suministro);
        return suministros ;
    }

    public ArrayList<ReporteDeVentas> ingresoinforme(ReporteDeVentas reporteDeVentas,ArrayList<ReporteDeVentas> reportesDeVentas){
        reportesDeVentas.add(reporteDeVentas);
        return reportesDeVentas;
    }
    
    public String liberacionAnimal(Animal animal){ 
       String mensaje = "";
      if(animal.getStage().equals("rehabilitado")){
       mensaje = "Este animal está listo para ser liberado en su habitad natural";
       }
       return mensaje;
    }
    
}
